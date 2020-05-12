package pl.project.fieldgame.DTOs;

import lombok.Getter;
import lombok.Setter;
import pl.project.fieldgame.entities.LatLng;
import pl.project.fieldgame.utils.ObjectType;

@Getter
@Setter
public class ObjectOnMapDetailsDTO extends SimpleDTOWithId{
    ObjectType objectType;
    String hint;
    LatLng latLng;
}
