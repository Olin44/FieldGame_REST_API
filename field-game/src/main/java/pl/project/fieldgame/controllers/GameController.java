package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.DTOs.UserStatsDTO;
import pl.project.fieldgame.services.UserGameService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

    private final UserGameService userGameService;

    @GetMapping("addNewUserGameToUser/{userId}/{mapId}")
    private UserGameDTO addNewUserGameToUser(@PathVariable(name = "userId") String userID, @PathVariable(name = "mapId") String mapId){
        return userGameService.addNewUserGameToUser(userID, mapId);
    }

    @PostMapping("saveResults")
    private UserGameDTO saveResults(@RequestBody UserGameDTO userGameDTO){
        return userGameService.saveResults(userGameDTO);
    }

    @GetMapping("getUserResult/{userId}")
    private List<UserStatsDTO> getUserResult(@PathVariable(name = "userId") String userID){
        return userGameService.getUserResult(userID);
    }


}
