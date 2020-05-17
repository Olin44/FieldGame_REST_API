package pl.project.fieldgame.services;

import pl.project.fieldgame.DTOs.UserGameDTO;

public interface UserGameService {
    public UserGameDTO addNewUserGameToUser(String userID, String mapId);

    UserGameDTO saveResults(UserGameDTO userGameDTO);
}
