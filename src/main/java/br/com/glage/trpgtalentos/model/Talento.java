package br.com.glage.trpgtalentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Talento {

    @MongoId
    private String id;

    private String nome;
    private String descricao;
    private List<String> preRequisitos;
    private List<Caracteristica> caracteristicas;
    private String fonte;
    private TipoEnum tipo;
}
