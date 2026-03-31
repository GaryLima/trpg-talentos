package br.com.glage.trpgtalentos.controller.mapper;

import br.com.glage.trpgtalentos.controller.dto.TalentoDTO;
import br.com.glage.trpgtalentos.model.Talento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        CaracteristicaMapper.class
})
public interface TalentoMapper {

    Talento toEntity(TalentoDTO dto);

    TalentoDTO toDTO(Talento entity);
}
