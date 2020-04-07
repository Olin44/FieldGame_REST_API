package pl.project.fieldgame.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@RequiredArgsConstructor
@MappedSuperclass
public class Simple {

    @Id @Column(length=36, nullable=false)
    String id;

    @PrePersist
    public void genId() {
        if (id == null)
            id = UUID.randomUUID().toString();
    }

}
