package pl.kathelan.jpatwoentitiesmappingtest.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "\"user\"")  // Użyj cudzysłowów tutaj
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
