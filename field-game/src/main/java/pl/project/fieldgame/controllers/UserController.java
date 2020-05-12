package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.project.fieldgame.DTOs.LoginUserDTO;
import pl.project.fieldgame.DTOs.LogoutUserDTO;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.services.UserGameService;
import pl.project.fieldgame.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController  {

    private final UserService userService;
    private final UserGameService userGameService;

    @PostMapping("/registerUser")
    private MyUserDTO registerUser(@RequestBody MyUserDTO myUserDTO){
        return userService.registerUser(myUserDTO);
    }

    @PostMapping("/login")
    private MyUserDTO login(@RequestBody LoginUserDTO loginUserDTO){
        return userService.login(loginUserDTO);
    }

    @PostMapping("/addNewUserGameToUser")
    private UserGameDTO addNewUserGameToUser(@RequestBody UserGameDTO userGameDTO){
        return userGameService.addNewUserGameToUser(userGameDTO);
    }

    @PostMapping("/logout")
    private LogoutUserDTO logout(@RequestBody LogoutUserDTO logoutUserDTO){
        return userService.logout(logoutUserDTO);
    }

}
