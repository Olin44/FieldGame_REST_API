package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.Setter;
import pl.project.fieldgame.utils.ObjectType;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ObjectOnMapDetails extends Simple {
    private ObjectType objectType;

    @ManyToOne(optional=false)
    @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
    private Map map;

    private String hint;
}
