package pl.kathelan.jpatwoentitiesmappingtest.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "base_code")
@Data
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "entity_type", discriminatorType = DiscriminatorType.STRING)
public class BaseCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "related_entity_id")
    private Long relatedEntityId;

//    @Column(name = "entity_type")
//    private String entityType; // Typ powiązanej encji (np. User, Address)

    // Gettery, settery, konstruktory
}
