package pl.kathelan.jpatwoentitiesmappingtest.entities;

import jakarta.persistence.*;

@Entity
public class AddressCode extends BaseCode {

    @Enumerated(EnumType.STRING)
    @Column(name = "\"type\"") // Użyj cudzysłowów tutaj
    private EnumTypes.AddressType type;

    @Column(name = "\"value\"") // Użyj cudzysłowów tutaj, jeśli potrzebne
    private String value;

}
