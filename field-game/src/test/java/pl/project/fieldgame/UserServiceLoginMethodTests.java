//package pl.project.fieldgame;
//
//import org.junit.jupiter.api.Test;
//import pl.project.fieldgame.DTOs.LoginUserDTO;
//import pl.project.fieldgame.DTOs.MyUserDTO;
//import pl.project.fieldgame.entities.MyUser;
//import pl.project.fieldgame.services.ApiException;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//
//class UserServiceLoginMethodTests extends UserServiceTests{
//
//    private MyUser myUser = new MyUser(USERNAME, PASSWORD, VALID_EMAIL, false);
//
//    void providedUserIsInDatabase(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, VALID_EMAIL);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.of(myUser));
//
//
//        assertThat(userService.login(loginUserDTO)).isEqualTo(new )
//
//    }
//
//    @Test
//    void providedUserIsNotInDatabase(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, VALID_EMAIL);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userProvideWrongPassword(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO("wrongPassword", VALID_EMAIL);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userProvideWrongEmail(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, "wrong@gmail.com");
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userProvideWrongEmailAndWrongPassword(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO("wrongPassword", "wrongEmail");
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userDontProvidePassword(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO("", "wrongEmail");
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//
//    @Test
//    void userDontProvideEmail(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, "");
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.empty());
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userIsLoggedOnAnotherDevice(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, VALID_EMAIL);
//        MyUser userLoggedOnAnotherDevice = new MyUser(USERNAME, PASSWORD, VALID_EMAIL, true);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.of(userLoggedOnAnotherDevice));
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isFalse();
//    }
//
//    @Test
//    void userIsNotLoggedOnOtherDevice(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, VALID_EMAIL);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.of(myUser));
//        Boolean isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess)
//                .isTrue();
//    }
//
//    @Test(expected = IndexOutOfBoundsException.class)
//    void userProvideInvalidEmail(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, "incorect Email");
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.of(myUser));
//        assertThrownuserService.login(loginUserDTO);
//        exception.expect(IndexOutOfBoundsException.class);
//
//    }
//    @Test
//    void userProvideValidEmail(){
//        LoginUserDTO loginUserDTO = new LoginUserDTO(PASSWORD, VALID_EMAIL);
//        when(userRepository.findByEmail(loginUserDTO.getEmail())).thenReturn(Optional.of(myUser));
//        MyUserDTO isSuccess = userService.login(loginUserDTO);
//        assertThat(isSuccess).isEqualTo(myUser);
//    }
//}
