package pl.project.fieldgame.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.project.fieldgame.DTOs.ObjectOnMapDetailsDTO;
import pl.project.fieldgame.entities.ObjectOnMapDetails;

@Mapper
public interface ObjectOnMapDetailsMapper extends SimpleMapper<ObjectOnMapDetails, ObjectOnMapDetailsDTO> {
//    @Mapping(target = "map", ignore = true)
//    ObjectOnMapDetailsDTO toDTO(ObjectOnMapDetails entity);
}
