package pl.project.fieldgame.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.DTOs.UserGameDTO;
import pl.project.fieldgame.entities.MyUser;
import pl.project.fieldgame.mappers.UserGameMapper;
import pl.project.fieldgame.mappers.UserMapper;
import pl.project.fieldgame.repositories.UserGameRepository;
import pl.project.fieldgame.repositories.UserRepository;

@RequiredArgsConstructor
@Service
public class UserGameServiceImpl implements UserGameService {
    private final UserGameMapper userGameMapper;
    private final UserGameRepository userGameRepository;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserGameDTO addNewUserGameToUser(UserGameDTO userGameDTO) {
        return userRepository
                .findById(userGameDTO.getUserId())
                .map(u -> addUserGame(u, userGameDTO))
//                .filter(this::newUserGameIsInUserGamesList)
                .orElseThrow(() ->new ApiException("add game to user error"));
    }


    private UserGameDTO addUserGame(MyUser myUser, UserGameDTO userGameDTO){
        myUser.getUserGame().add(userGameMapper.toEntity(userGameDTO));
        userRepository.save(myUser);
        return userGameDTO;
    }

//    private boolean newUserGameIsInUserGamesList(UserGameDTO userGameDTO){
//        return userGameRepository
//                .findByUserId(userGameDTO.getUserId())
//                .stream()
//                .anyMatch(u -> u.getUserId().equals(userGameDTO.getUserId()));
//    }

}
