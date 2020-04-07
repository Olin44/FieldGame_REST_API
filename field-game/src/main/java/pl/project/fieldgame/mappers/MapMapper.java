package pl.project.fieldgame.mappers;

import org.mapstruct.Mapper;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.entities.Map;

@Mapper
public interface MapMapper extends SimpleMapper<Map, MapDTO> {
}
