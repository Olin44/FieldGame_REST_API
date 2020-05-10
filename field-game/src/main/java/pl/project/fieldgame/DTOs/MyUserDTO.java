package pl.project.fieldgame.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyUserDTO extends SimpleDTO {
    private String username;
    private String password;
    private String email;
    private boolean isActive;
}
