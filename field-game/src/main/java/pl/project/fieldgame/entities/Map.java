package pl.project.fieldgame.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Map extends Simple {

    String name;

    @OneToMany(mappedBy="map", cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    List<ObjectOnMapDetails> objectOnMapDetails;
}
