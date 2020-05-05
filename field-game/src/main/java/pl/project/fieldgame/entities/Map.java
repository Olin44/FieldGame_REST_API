package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@RequiredArgsConstructor
public class Map extends Simple {

    @Getter
    private String name;

    @Getter
    @OneToMany(mappedBy="map")
    @Fetch(value = FetchMode.JOIN)

    List<ObjectOnMapDetails> objectOnMapDetails;
}
