package pl.project.fieldgame.services;

import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.DTOs.UserStatsDTO;

import java.util.List;

public interface UserGameService {
    public UserGameDTO addNewUserGameToUser(String userID, String mapId);

    UserGameDTO saveResults(UserGameDTO userGameDTO);

    List<UserStatsDTO> getUserResult(String userID);
}
