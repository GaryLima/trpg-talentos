package br.com.glage.trpgtalentos.controller.mapper;

import br.com.glage.trpgtalentos.controller.dto.SubCaracteristicaDTO;
import br.com.glage.trpgtalentos.model.SubCaracteristica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubCaracteristicaMapper {
    SubCaracteristica toEntity(SubCaracteristicaDTO dto);

    SubCaracteristicaDTO toDTO(SubCaracteristica entity);
}
