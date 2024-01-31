package pl.kathelan.jpatwoentitiesmappingtest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.kathelan.jpatwoentitiesmappingtest.dto.UserDto;
import pl.kathelan.jpatwoentitiesmappingtest.entities.User;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
