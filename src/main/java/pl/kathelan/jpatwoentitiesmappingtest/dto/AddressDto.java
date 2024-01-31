package pl.kathelan.jpatwoentitiesmappingtest.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddressDto {
    private String code;
    private String value;
}
