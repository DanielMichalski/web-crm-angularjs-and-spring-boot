package pl.dmichalski.crm.web.presentation.company_sector.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.crm.core.business.company_sectors.boundary.CompanySectorsService;
import pl.dmichalski.crm.core.business.company_sectors.entity.CompanySector;
import pl.dmichalski.crm.core.business.user.entity.User;
import pl.dmichalski.crm.web.presentation.company_sector.entity.CompanySectorDTO;
import pl.dmichalski.crm.web.presentation.user.entity.UserDTO;

import java.util.Collection;

@Service
public class CompanySectorPresentationService {

    private CompanySectorsService companySectorsService;
    private CompanySectorToCompanySectorDTO companySectorToCompanySectorDTO;

    @Autowired
    public CompanySectorPresentationService(CompanySectorsService companySectorsService,
                                            CompanySectorToCompanySectorDTO companySectorToCompanySectorDTO) {
        this.companySectorsService = companySectorsService;
        this.companySectorToCompanySectorDTO = companySectorToCompanySectorDTO;
    }

    public Collection<CompanySectorDTO> findAll() {
        Collection<CompanySector> companySectors = companySectorsService.findAll();
        return companySectorToCompanySectorDTO.convertAll(companySectors);
    }
}
