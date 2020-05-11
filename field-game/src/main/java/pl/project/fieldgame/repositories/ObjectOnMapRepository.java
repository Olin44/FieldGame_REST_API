package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.ObjectOnMapDetails;

import java.util.List;

public interface ObjectOnMapRepository extends JpaRepository<ObjectOnMapDetails, String> {
    List<ObjectOnMapDetails> findAllByMapIdIn(List<String> ids);
}
