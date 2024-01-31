package pl.kathelan.jpatwoentitiesmappingtest.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@RequiredArgsConstructor
@DiscriminatorValue("User")
public class UserCode extends BaseCode {


    @Enumerated(EnumType.STRING)
    @Column(name = "\"type\"") // Użyj cudzysłowów tutaj
    private EnumTypes.UserType type;

    @Column(name = "\"value\"") // Użyj cudzysłowów tutaj, jeśli potrzebne
    private String value;
}
