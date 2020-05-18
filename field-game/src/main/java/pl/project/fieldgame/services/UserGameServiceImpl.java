package pl.project.fieldgame.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.DTOs.UserStatsDTO;
import pl.project.fieldgame.entities.MyUser;
import pl.project.fieldgame.entities.UserGame;
import pl.project.fieldgame.mappers.UserGameMapper;
import pl.project.fieldgame.mappers.UserMapper;
import pl.project.fieldgame.repositories.MapRepository;
import pl.project.fieldgame.repositories.UserGameRepository;
import pl.project.fieldgame.repositories.UserRepository;

import java.util.*;

@RequiredArgsConstructor
@Service
public class UserGameServiceImpl implements UserGameService {
    private final UserGameMapper userGameMapper;
    private final UserGameRepository userGameRepository;
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final MapRepository mapRepository;

    @Override
    public UserGameDTO addNewUserGameToUser(String userID, String mapId) {
        return userRepository
                .findById(userID)
                .map(u -> addUserGame(u, mapId))
//                .filter(this::newUserGameIsInUserGamesList)
                .orElseThrow(() ->new ApiException("add game to user error"));
    }

    @Override
    public UserGameDTO saveResults(UserGameDTO userGameDTO) {
        UserGame userGame = userGameRepository.findById(userGameDTO.getId()).get();
        userGame.setActive(userGameDTO.isActive());
        userGame.setMapId(userGameDTO.getMapId());
        userGame.setPoints(userGameDTO.getPoints());
        userGame.setUserId(userGameDTO.getUserId());
        userGame.setEndGame(new Date());
        userGameRepository.save(userGame);
        return userGameRepository
                .findById(userGameDTO.getId())
                .map(userGameMapper::toDTO)
                .orElseThrow(() ->new ApiException("save result game to user error"));
    }

    @Override
    public List<UserStatsDTO> getUserResult(String userID) {
        List<UserGame> userGameList = userGameRepository.findByUserId(userID);
        List<String> mapIds = new ArrayList<>();
        userGameList.forEach(userGame -> mapIds.add(userGame.getMapId()));
        Map<String, String> mapNameAndIdPairs = new HashMap<>();

        mapRepository.findAllById(mapIds).forEach(map ->  mapNameAndIdPairs.put(map.getId(), map.getName()));

        List<UserStatsDTO> userStats = new ArrayList<>();
        for(UserGame userGame: userGameList){
            userStats.add(UserStatsDTO
                    .builder()
                    .mapName(mapNameAndIdPairs.get(userGame.getMapId()))
                    .points(userGame.getPoints())
                    .endGame(userGame.getEndGame())
                    .build());
        }

        if(userStats.isEmpty()){
            throw new ApiException("empy stats");
        }else {
            return userStats;
        }
    }

    private UserGameDTO addUserGame(MyUser myUser, String mapId){
        UserGame userGame = UserGame.builder().userId(myUser.getId()).mapId(mapId).isActive(true).points(0L).build();
        myUser.getUserGame().add(userGame);
        userRepository.save(myUser);
        List<UserGame> userGameList = userGameRepository.findByUserId(myUser.getId());
        return userGameMapper.toDTO(userGameList.get(userGameList.size()-1));
    }

}
