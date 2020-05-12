package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pl.project.fieldgame.utils.ObjectType;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class ObjectOnMapDetails extends SimpleEntity {
    private ObjectType objectType;
    private String mapId;
    @OneToOne
    @JoinColumn(name = "objectOnMapDetailsId")
    private LatLng latLng;
    private String hint;
}
