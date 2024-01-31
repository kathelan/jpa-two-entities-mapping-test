package pl.kathelan.jpatwoentitiesmappingtest.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
@DiscriminatorValue("Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
