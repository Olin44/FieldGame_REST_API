package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.services.UserGameService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

    private final UserGameService userGameService;

    @GetMapping("addNewUserGameToUser/{userId}/{mapId}")
    private UserGameDTO addNewUserGameToUser(@PathVariable(name = "userId") String userID, @PathVariable(name = "mapId") String mapId){
        return userGameService.addNewUserGameToUser(userID, mapId);
    }



}
