package pl.project.fieldgame.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@RequiredArgsConstructor
@MappedSuperclass
public class Simple {

    @Getter
    @JsonIgnore
    @Id @Column(length=36, nullable=false)
    private String id;

    @PrePersist
    public void genId() {
        if (id == null)
            id = UUID.randomUUID().toString();
    }

}
