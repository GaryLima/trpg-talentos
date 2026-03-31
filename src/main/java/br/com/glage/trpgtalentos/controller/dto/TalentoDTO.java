package br.com.glage.trpgtalentos.controller.dto;

import br.com.glage.trpgtalentos.model.TipoEnum;

import java.util.List;

public record TalentoDTO(
        String nome,
        String descricao,
        List<String> preRequisitos,
        List<CaracteristicaDTO> caracteristicas,
        String fonte,
        TipoEnum tipo
) {
}
