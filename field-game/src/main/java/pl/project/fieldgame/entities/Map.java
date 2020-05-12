package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Map extends SimpleEntity {
    private String name;
    @OneToMany
    @JoinColumn(name = "mapId")
    List<ObjectOnMapDetails> objectOnMapDetails;
}
