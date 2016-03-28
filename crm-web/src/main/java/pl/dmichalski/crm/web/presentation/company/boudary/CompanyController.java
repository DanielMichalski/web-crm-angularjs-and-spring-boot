package pl.dmichalski.crm.web.presentation.company.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.core.business.company.control.CompanyRepository;
import pl.dmichalski.crm.core.business.company.entity.CompanySector;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @RequestMapping
    public List<CompanySector> findAllCompanySectors() {
        return companyRepository.findAll();
    }

}
