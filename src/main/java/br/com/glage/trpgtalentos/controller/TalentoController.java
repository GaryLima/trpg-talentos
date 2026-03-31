package br.com.glage.trpgtalentos.controller;

import br.com.glage.trpgtalentos.controller.dto.TalentoDTO;
import br.com.glage.trpgtalentos.controller.mapper.TalentoMapper;
import br.com.glage.trpgtalentos.model.Talento;
import br.com.glage.trpgtalentos.service.TalentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/talentos")
public class TalentoController {

    private final TalentoService talentoService;
    private final TalentoMapper talentoMapper;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody TalentoDTO dto) {
        Talento talento = talentoMapper.toEntity(dto);

        talentoService.salvar(talento);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/batch")
    public ResponseEntity<Void> salvarBatch(@RequestBody List<TalentoDTO> dtos) {
        dtos.forEach(criaturasDTO -> talentoService.salvar(talentoMapper.toEntity(criaturasDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<?> buscarPorNome(@PathVariable String nome) {
        return talentoService.buscaPorNome(nome)
                .map(talento -> {
                    TalentoDTO dto = talentoMapper.toDTO(talento);
                    return ResponseEntity.ok(dto);
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<?> listar() {
        List<Talento> talentos = talentoService.listarTalentos();
        List<TalentoDTO> talentoDTOS = talentos
                .stream()
                .map(talentoMapper::toDTO)
                .toList();

        return ResponseEntity.ok(talentoDTOS);
    }
}
