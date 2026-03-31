package br.com.glage.trpgtalentos.repository;

import br.com.glage.trpgtalentos.model.Talento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TalentoRepository extends MongoRepository<Talento, String> {
    Optional<Talento> findTalentoByNome(String nome);
}
