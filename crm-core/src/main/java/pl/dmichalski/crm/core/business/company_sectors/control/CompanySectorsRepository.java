package pl.dmichalski.crm.core.business.company_sectors.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.crm.core.business.company_sectors.entity.CompanySector;

@Repository
public interface CompanySectorsRepository extends JpaRepository<CompanySector, Integer> {
}
