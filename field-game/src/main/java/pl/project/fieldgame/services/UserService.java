package pl.project.fieldgame.services;

import pl.project.fieldgame.DTOs.LoginUserDTO;
import pl.project.fieldgame.DTOs.LogoutUserDTO;
import pl.project.fieldgame.DTOs.MyUserDTO;

public interface UserService {
    MyUserDTO registerUser(MyUserDTO myUserDTO);

    MyUserDTO login(LoginUserDTO loginUserDTO);

    LogoutUserDTO logout(LogoutUserDTO logoutUserDTO);
}
