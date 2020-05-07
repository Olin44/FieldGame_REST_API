package pl.project.fieldgame.mappers;

import org.mapstruct.Mapper;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.entities.MyUser;

@Mapper
public interface UserMapper extends SimpleMapper<MyUser, MyUserDTO> {
}
