package pl.project.fieldgame.DTOs;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class UserStatsDTO {
    String mapName;
    Long points;
    Date endGame;
}
