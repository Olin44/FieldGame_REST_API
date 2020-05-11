package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.LatLng;

import java.util.List;

public interface LatLngRepository extends JpaRepository<LatLng, String> {
    List<LatLng> findAllByObjectOnMapDetailsIdIn(List<String> objectOnMapDetailsId);
}
