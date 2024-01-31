package pl.kathelan.jpatwoentitiesmappingtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kathelan.jpatwoentitiesmappingtest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
