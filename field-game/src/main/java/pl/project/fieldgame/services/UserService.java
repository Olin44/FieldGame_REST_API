package pl.project.fieldgame.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.entities.MyUser;

import pl.project.fieldgame.mappers.SimpleMapper;
import pl.project.fieldgame.mappers.UserMapper;
import pl.project.fieldgame.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public boolean registerUser(MyUserDTO myUserDTO){
        try {
            if(isUserInDatabase(myUserDTO)){
                return false;
            }else{
                MyUser myUser = userMapper.toEntity(myUserDTO);
                userRepository.save(myUser);
                return true;
            }
        }
        catch (Exception e){
            return false;
        }
    }

    private boolean isUserInDatabase(MyUserDTO myUserDTO){
        return userRepository.findByUsername(myUserDTO.getUsername()).isPresent();
    }
}
