package pl.project.fieldgame.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class MyUser extends SimpleEntity {
    private String username;
    private String password;
    private String email;
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    List<UserGame> userGame;

}
