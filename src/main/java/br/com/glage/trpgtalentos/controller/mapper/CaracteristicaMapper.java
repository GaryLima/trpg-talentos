package br.com.glage.trpgtalentos.controller.mapper;


import br.com.glage.trpgtalentos.controller.dto.CaracteristicaDTO;
import br.com.glage.trpgtalentos.model.Caracteristica;
import br.com.glage.trpgtalentos.model.SubCaracteristica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        SubCaracteristica.class
})
public interface CaracteristicaMapper {
    Caracteristica toEntity(CaracteristicaDTO dto);

    CaracteristicaDTO toDTO(Caracteristica entity);
}
