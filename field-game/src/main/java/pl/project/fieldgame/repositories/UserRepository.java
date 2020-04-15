package pl.project.fieldgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.project.fieldgame.entities.MyUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, String> {
    Optional<MyUser> findByUsername(String userName);
}
