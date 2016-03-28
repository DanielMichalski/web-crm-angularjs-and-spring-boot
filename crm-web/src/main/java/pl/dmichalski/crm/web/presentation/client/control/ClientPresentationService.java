package pl.dmichalski.crm.web.presentation.client.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.crm.core.business.client.boundary.ClientService;
import pl.dmichalski.crm.core.business.client.entity.Client;
import pl.dmichalski.crm.web.presentation.client.entity.ClientDTO;

import java.util.Collection;
import java.util.List;

@Service
public class ClientPresentationService {

    private ClientService clientService;
    private ClientToClientDTO converter;

    @Autowired
    public ClientPresentationService(ClientService clientService, ClientToClientDTO converter) {
        this.clientService = clientService;
        this.converter = converter;
    }

    public Collection<ClientDTO> findAll() {
        List<Client> clients = clientService.findAll();
        return converter.convertAll(clients);
    }
}
