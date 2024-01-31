package pl.kathelan.jpatwoentitiesmappingtest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserDto {
    private String code;
    private String value;
}
