package pl.kathelan.jpatwoentitiesmappingtest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kathelan.jpatwoentitiesmappingtest.dto.UserDto;
import pl.kathelan.jpatwoentitiesmappingtest.entities.EnumTypes;
import pl.kathelan.jpatwoentitiesmappingtest.entities.User;
import pl.kathelan.jpatwoentitiesmappingtest.entities.UserCode;
import pl.kathelan.jpatwoentitiesmappingtest.repositories.BaseCodeRepository;
import pl.kathelan.jpatwoentitiesmappingtest.repositories.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final BaseCodeRepository baseCodeRepository;
    public User createUser(UserDto userDto) {
        User user = new User();
        user = userRepository.save(user);

        UserCode userCode = new UserCode();
        userCode.setType(EnumTypes.UserType.valueOf(userDto.getCode()));
        userCode.setValue(userDto.getValue());
        userCode.setRelatedEntityId(user.getId());
        baseCodeRepository.save(userCode);

        return user;
    }
}
