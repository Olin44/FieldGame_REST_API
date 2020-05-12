//package pl.project.fieldgame;
//
//import org.junit.jupiter.api.Test;
//import pl.project.fieldgame.DTOs.MyUserDTO;
//import pl.project.fieldgame.entities.MyUser;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//
//public class UserServiceRegisterMethodTests extends UserServiceTests{
//    private MyUserDTO myUserDTO = new MyUserDTO(USERNAME, PASSWORD, VALID_EMAIL, false);
//    private MyUser myUser = new MyUser("ID", USERNAME, PASSWORD, VALID_EMAIL, false);
//
//
//    @Test
//    void userIsInDataBase(){
//        when(userRepository.findByEmail(myUserDTO.getEmail())).thenReturn(Optional.of(myUser));
//
//        assertThat(userService.registerUser(myUserDTO)).isEqualTo(null);
//    }
//    @Test
//    void userNotInDataBase(){
//        when(userRepository.findByEmail(myUserDTO.getEmail())).thenReturn(Optional.empty());
//
//        assertThat(userService.registerUser(myUserDTO)).isEqualTo(myUserDTO);
//    }
//}
