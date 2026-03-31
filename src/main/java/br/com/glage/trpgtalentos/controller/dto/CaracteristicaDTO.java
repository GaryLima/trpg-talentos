package br.com.glage.trpgtalentos.controller.dto;

import java.util.List;

public record CaracteristicaDTO (
        String titulo,
        String descricao,
        List<SubCaracteristicaDTO> subCaracteristicas

){
}
