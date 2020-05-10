package pl.project.fieldgame;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import pl.project.fieldgame.mappers.UserMapper;
import pl.project.fieldgame.repositories.UserRepository;
import pl.project.fieldgame.services.UserService;
import pl.project.fieldgame.services.UserServiceImpl;

class UserServiceTests {
    final String USERNAME = "tester";
    final String PASSWORD = "PASSWORD";
    final String VALID_EMAIL = "VALID_EMAIL@gmail.com";

    @Mock
    UserMapper userMapper;
    UserRepository userRepository = Mockito.mock(UserRepository.class);
    UserService userService;


    @BeforeEach
    void initUserService(){
        userService = new UserServiceImpl(userRepository, userMapper);
    }

}
