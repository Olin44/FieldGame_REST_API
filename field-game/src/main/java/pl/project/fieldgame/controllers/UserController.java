package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController  {

    private final UserService userService;

    @PostMapping("/registerUser")
    private boolean registerUser(@RequestBody MyUserDTO myUserDTO){
        return userService.registerUser(myUserDTO);
    }

}
