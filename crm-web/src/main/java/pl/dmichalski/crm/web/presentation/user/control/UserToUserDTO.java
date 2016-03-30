package pl.dmichalski.crm.web.presentation.user.control;

import org.springframework.stereotype.Component;
import pl.dmichalski.crm.core.business.user.entity.User;
import pl.dmichalski.crm.web.conversion.EntityToDTO;
import pl.dmichalski.crm.web.presentation.user.entity.UserDTO;

@Component
class UserToUserDTO implements EntityToDTO<User, UserDTO> {

    @Override
    public UserDTO convert(User user) {
        return UserDTO.create()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

}
