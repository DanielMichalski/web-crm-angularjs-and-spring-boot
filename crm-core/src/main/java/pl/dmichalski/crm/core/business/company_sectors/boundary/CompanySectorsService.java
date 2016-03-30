package pl.dmichalski.crm.core.business.company_sectors.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.crm.core.business.company_sectors.control.CompanySectorsRepository;
import pl.dmichalski.crm.core.business.company_sectors.entity.CompanySector;

import java.util.Collection;

@Service
public class CompanySectorsService {

    private CompanySectorsRepository companySectorsRepository;

    @Autowired
    public CompanySectorsService(CompanySectorsRepository companySectorsRepository) {
        this.companySectorsRepository = companySectorsRepository;
    }

    public Collection<CompanySector> findAll() {
        return companySectorsRepository.findAll();
    }

}
