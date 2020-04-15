package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class MyUser extends Simple {
    private String username;
    private String password;
    private boolean active;
    private String roles;
}
