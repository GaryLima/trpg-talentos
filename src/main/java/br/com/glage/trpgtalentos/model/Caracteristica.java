package br.com.glage.trpgtalentos.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Caracteristica {
    private String titulo;
    private String descricao;
    private List<SubCaracteristica> subCaracteristicas;
}
