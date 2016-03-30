package pl.dmichalski.crm.web.presentation.company_sector.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.web.presentation.company_sector.control.CompanySectorPresentationService;
import pl.dmichalski.crm.web.presentation.company_sector.entity.CompanySectorDTO;

import java.util.Collection;

@RestController
@RequestMapping("/api/sectors")
public class CompanySectorController {

    private CompanySectorPresentationService companySectorPresentationService;

    @Autowired
    public CompanySectorController(CompanySectorPresentationService companySectorPresentationService) {
        this.companySectorPresentationService = companySectorPresentationService;
    }

    @RequestMapping
    public Collection<CompanySectorDTO> findAllCompanySectors() {
        return companySectorPresentationService.findAll();
    }

}
