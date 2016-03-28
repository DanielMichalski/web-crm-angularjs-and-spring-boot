package pl.dmichalski.crm.core.business.company.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.crm.core.business.company.entity.CompanySector;

@Repository
public interface CompanyRepository extends JpaRepository<CompanySector, Integer> {
}
