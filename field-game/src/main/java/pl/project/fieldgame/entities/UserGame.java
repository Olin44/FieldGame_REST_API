package pl.project.fieldgame.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class UserGame extends SimpleEntity {
    String mapId;
    String userId;
    Long points;
    boolean isActive;
}
