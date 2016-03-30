package pl.dmichalski.crm.web.presentation.user.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.crm.core.business.user.boundary.UserService;
import pl.dmichalski.crm.core.business.user.entity.User;
import pl.dmichalski.crm.web.presentation.user.entity.UserDTO;

import java.util.Collection;

@Service
public class UserPresentationService {

    private UserService userService;
    private UserToUserDTO userToUserDTO;

    @Autowired
    public UserPresentationService(UserService userService, UserToUserDTO userToUserDTO) {
        this.userService = userService;
        this.userToUserDTO = userToUserDTO;
    }

    public Collection<UserDTO> findAll() {
        Collection<User> users = userService.findAll();
        return userToUserDTO.convertAll(users);
    }
}
