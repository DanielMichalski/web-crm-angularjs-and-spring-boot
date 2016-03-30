package pl.dmichalski.crm.web.presentation.user.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.web.presentation.user.control.UserPresentationService;
import pl.dmichalski.crm.web.presentation.user.entity.UserDTO;

import java.util.Collection;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserPresentationService userPresentationService;

    @Autowired
    public UserController(UserPresentationService userPresentationService) {
        this.userPresentationService = userPresentationService;
    }

    @RequestMapping
    public Collection<UserDTO> findAllUsers() {
        return userPresentationService.findAll();
    }

}
