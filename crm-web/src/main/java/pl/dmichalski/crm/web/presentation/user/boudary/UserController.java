package pl.dmichalski.crm.web.presentation.user.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.core.business.user.control.UserRepository;
import pl.dmichalski.crm.core.business.user.entity.User;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping
    public List<User> findAllUsers2() {
        return userRepository.findAll();
    }

}
