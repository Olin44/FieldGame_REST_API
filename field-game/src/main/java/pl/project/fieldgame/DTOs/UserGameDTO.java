package pl.project.fieldgame.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserGameDTO extends SimpleDTO {
   	    String mapId;
   	    String userId;
        Long points;
    	boolean isActive;
}
