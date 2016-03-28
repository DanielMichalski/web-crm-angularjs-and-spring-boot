package pl.dmichalski.crm.web.presentation.client.control;

import org.springframework.stereotype.Component;
import pl.dmichalski.crm.core.business.client.entity.Client;
import pl.dmichalski.crm.web.conversion.EntityToDTO;
import pl.dmichalski.crm.web.presentation.client.entity.ClientDTO;

@Component
public class ClientToClientDTO implements EntityToDTO<Client, ClientDTO>{

    @Override
    public ClientDTO convert(Client client) {
       return ClientDTO.create()
                .id(client.getId())
                .companyName(client.getCompanyName())
                .contactName(client.getContactName())
                .contactPhone(client.getContactPhone())
                .contactEmail(client.getContactEmail())
                .userName(client.getUser().getName())
                .notes(client.getNotes())
                .companySectorName(client.getCompanySector().getName())
                .build();
    }


}
