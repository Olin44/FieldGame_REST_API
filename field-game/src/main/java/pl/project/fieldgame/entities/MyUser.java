package pl.project.fieldgame.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class MyUser extends Simple {
    private String username;
    private String password;
    private String email;
    private boolean isActive;
    //private String roles;
}
