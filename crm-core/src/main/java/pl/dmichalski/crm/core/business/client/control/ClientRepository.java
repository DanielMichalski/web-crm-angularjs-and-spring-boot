package pl.dmichalski.crm.core.business.client.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.crm.core.business.client.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
