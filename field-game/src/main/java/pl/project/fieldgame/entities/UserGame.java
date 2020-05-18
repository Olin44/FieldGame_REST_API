package pl.project.fieldgame.entities;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
public class UserGame extends SimpleEntity {
    private String mapId;
    private String userId;
    private Long points;
    private boolean isActive;
    private Date endGame;

    public UserGame() {
    }

    public UserGame(String mapId, String userId, Long points, boolean isActive, Date endGame) {
        this.mapId = mapId;
        this.userId = userId;
        this.points = points;
        this.isActive = isActive;
        this.endGame = endGame;
    }
}
