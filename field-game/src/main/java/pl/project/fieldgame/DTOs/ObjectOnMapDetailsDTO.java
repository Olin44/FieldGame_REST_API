package pl.project.fieldgame.DTOs;

import lombok.Getter;
import lombok.Setter;
import pl.project.fieldgame.utils.ObjectType;

@Getter
@Setter
public class ObjectOnMapDetailsDTO extends SimpleDTO{
    ObjectType objectType;
    MapDTO map;
    String hint;
}