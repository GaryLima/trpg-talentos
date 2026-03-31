package br.com.glage.trpgtalentos.service;

import br.com.glage.trpgtalentos.model.Talento;
import br.com.glage.trpgtalentos.repository.TalentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TalentoService {

    private final TalentoRepository talentoRepository;

    public void salvar(Talento talento) {
        talentoRepository.save(talento);
    }

    public Optional<Talento> buscaPorNome(String nome) {
        return talentoRepository.findTalentoByNome(nome);
    }

    public List<Talento> listarTalentos() {
        return talentoRepository.findAll();
    }

    public void deletar(Talento talento) {
        talentoRepository.delete(talento);
    }

    public void atualizar(Talento talento) {
        talentoRepository.save(talento);
    }
}
