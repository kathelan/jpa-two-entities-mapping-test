package pl.kathelan.jpatwoentitiesmappingtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kathelan.jpatwoentitiesmappingtest.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
