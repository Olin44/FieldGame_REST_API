package pl.project.fieldgame.mappers;

import org.mapstruct.Mapper;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.entities.UserGame;

@Mapper
public interface UserGameMapper extends SimpleMapper<UserGame, UserGameDTO> {
}
