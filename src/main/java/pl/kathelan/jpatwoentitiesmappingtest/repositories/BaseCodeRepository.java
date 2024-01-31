package pl.kathelan.jpatwoentitiesmappingtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kathelan.jpatwoentitiesmappingtest.entities.BaseCode;

public interface BaseCodeRepository extends JpaRepository<BaseCode, Long> {
}
