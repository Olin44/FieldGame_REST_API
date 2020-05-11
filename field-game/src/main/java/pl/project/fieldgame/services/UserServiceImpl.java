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
        if(!isUserInDatabase(myUserDTO)){
            MyUser myUser = userMapper.toEntity(myUserDTO);
            userRepository.save(myUser);
            return myUserDTO;
        }else {
            throw new ApiException("login failder");
        }
    }

    @Override
    public boolean login(LoginUserDTO loginUserDTO) {

        if(isEmailValid(loginUserDTO.getEmail())) {
            Optional<MyUser> myUserOptional = userRepository.findByEmail(loginUserDTO.getEmail());
            if (myUserOptional.isPresent()) {
                MyUser myUser = myUserOptional.get();
                if (isLoginDataValid(loginUserDTO, myUser)) {
                    if (!isUserLoggedOnAnotherDevice(myUser)) {
                        myUser.setActive(true);
                        userRepository.save(myUser);
                        return true;
                    }
                }
            }
        }
        return false;
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

    private boolean isEmailValid(String email){
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
