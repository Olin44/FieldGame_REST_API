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
@Getter
@RequiredArgsConstructor
public class Map extends Simple {
    private String name;
    @OneToMany
    @JoinColumn(name = "mapId")
    List<ObjectOnMapDetails> objectOnMapDetails;
}
