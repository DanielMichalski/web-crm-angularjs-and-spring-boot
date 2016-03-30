package pl.dmichalski.crm.web.presentation.company_sector.control;

import org.springframework.stereotype.Component;
import pl.dmichalski.crm.core.business.company_sectors.entity.CompanySector;
import pl.dmichalski.crm.web.conversion.EntityToDTO;
import pl.dmichalski.crm.web.presentation.company_sector.entity.CompanySectorDTO;

@Component
class CompanySectorToCompanySectorDTO implements EntityToDTO<CompanySector, CompanySectorDTO> {

    @Override
    public CompanySectorDTO convert(CompanySector companySector) {
        return CompanySectorDTO.create()
                .id(companySector.getId())
                .name(companySector.getName())
                .build();
    }

}
