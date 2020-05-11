package pl.project.fieldgame.mappers;

import org.mapstruct.Mapper;
import pl.project.fieldgame.DTOs.LatLngDTO;
import pl.project.fieldgame.entities.LatLng;

@Mapper
public interface LatLngMapper extends SimpleMapper<LatLng, LatLngDTO> {
}
