package pl.dmichalski.crm.core.business.user.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.crm.core.business.user.control.UserRepository;
import pl.dmichalski.crm.core.business.user.entity.User;

import java.util.Collection;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<User> findAll() {
        return userRepository.findAll();
    }

}
