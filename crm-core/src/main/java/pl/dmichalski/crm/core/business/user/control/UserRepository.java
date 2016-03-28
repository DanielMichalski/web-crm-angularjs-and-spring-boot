package pl.dmichalski.crm.core.business.user.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.crm.core.business.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
