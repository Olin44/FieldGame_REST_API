package pl.project.fieldgame.mappers;

import org.mapstruct.factory.Mappers;
import pl.project.fieldgame.DTOs.SimpleDTO;
import pl.project.fieldgame.entities.Simple;

import java.util.List;

public interface SimpleMapper <E extends Simple, DTO extends SimpleDTO> {
    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);
    DTO toDTO(E entity);
    List<DTO> toDTOList(List<E> mapList);
}


