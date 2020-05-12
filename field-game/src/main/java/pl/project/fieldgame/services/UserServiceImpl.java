package pl.project.fieldgame.services;

import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.LoginUserDTO;
import pl.project.fieldgame.DTOs.MyUserDTO;
import pl.project.fieldgame.entities.MyUser;

import pl.project.fieldgame.mappers.SimpleMapper;
import pl.project.fieldgame.mappers.UserMapper;
import pl.project.fieldgame.repositories.UserRepository;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public MyUserDTO registerUser(MyUserDTO myUserDTO) {
        return Optional.of(myUserDTO)
                .filter(this::isUserNotInDataBase)
                .filter(this::isEmailValid)
                .map(this::saveUser)
                .orElseThrow(() ->new ApiException("Register error"));
    }

    @Override
    public MyUserDTO login(LoginUserDTO loginUserDTO) {
        return userRepository.findByEmail(loginUserDTO.getEmail())
                .filter(u -> isLoginDataValid(loginUserDTO, u))
                .filter(this::isUserNotLoggedOnAnotherDevice)
                .filter(this::save)
                .map(userMapper::toDTO)
                .orElseThrow(() ->new ApiException("Login error"));
    }

    private MyUserDTO saveUser(MyUserDTO myUserDTO){
        MyUser myUser = userMapper.toEntity(myUserDTO);
        userRepository.save(myUser);
        return myUserDTO;
    }

    private boolean isUserNotInDataBase(MyUserDTO myUserDTO){
        return !isUserInDatabase(myUserDTO);
    }
    private boolean isUserNotLoggedOnAnotherDevice(MyUser user) {
        return !isUserLoggedOnAnotherDevice(user);
    }

    private boolean save(MyUser user) {
        user.setActive(true);
        userRepository.save(user);
        return true;
    }

    private boolean isUserInDatabase(MyUserDTO myUserDTO){
        return userRepository.findByEmail(myUserDTO.getEmail()).isPresent();
    }

    private boolean isLoginDataValid(LoginUserDTO loginUserDTO, MyUser myUser){
        return loginUserDTO.getEmail().equals(myUser.getEmail())
                && loginUserDTO.getPassword().equals(myUser.getPassword());
    }

    private boolean isUserLoggedOnAnotherDevice(MyUser myUser){
        return myUser.isActive();
    }

    private boolean isEmailValid(MyUserDTO myUserDTO){
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(myUserDTO.getEmail());
        return matcher.matches();
    }
}
