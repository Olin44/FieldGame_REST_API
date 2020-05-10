package pl.project.fieldgame.services;

import pl.project.fieldgame.DTOs.LoginUserDTO;
import pl.project.fieldgame.DTOs.MyUserDTO;

public interface UserService {
    boolean registerUser(MyUserDTO myUserDTO);

    boolean login(LoginUserDTO loginUserDTO);
}
