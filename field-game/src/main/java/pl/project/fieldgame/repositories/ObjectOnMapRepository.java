package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.ObjectOnMapDetails;

public interface ObjectOnMapRepository extends JpaRepository<ObjectOnMapDetails, String> {
}
