package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.UserGame;

import java.util.List;
import java.util.Optional;

public interface UserGameRepository extends JpaRepository<UserGame, String> {
    List<UserGame> findByUserId(String id);

}
