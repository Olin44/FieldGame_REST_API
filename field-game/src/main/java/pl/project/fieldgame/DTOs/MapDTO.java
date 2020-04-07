package pl.project.fieldgame.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MapDTO extends SimpleDTO{
    String name;
    List<ObjectOnMapDetailsDTO> objectOnMapDetails;
}
