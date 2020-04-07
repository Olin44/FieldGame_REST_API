package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.Map;

public interface MapRepository extends JpaRepository<Map, String> {
}
