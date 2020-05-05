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

public class ObjectOnMapDetails extends Simple {
    @Getter
    @Setter
    private ObjectType objectType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "map_id")
    private Map map;

    @OneToOne

    @Getter
    @Setter
    private LatLng latLng;

    @Getter
    @Setter
    private String hint;
}
