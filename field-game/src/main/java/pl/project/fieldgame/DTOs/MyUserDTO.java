package pl.project.fieldgame.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class MyUserDTO extends SimpleDTOWithId {
    private String username;
    private String password;
    private String email;
    private boolean isActive;
}
