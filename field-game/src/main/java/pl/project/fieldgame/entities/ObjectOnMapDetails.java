package pl.project.fieldgame.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import pl.project.fieldgame.utils.ObjectType;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class ObjectOnMapDetails extends Simple {
    private ObjectType objectType;
    private String mapId;
    @OneToOne
    @JoinColumn(name = "objectOnMapDetailsId")
    private LatLng latLng;
    private String hint;
}
