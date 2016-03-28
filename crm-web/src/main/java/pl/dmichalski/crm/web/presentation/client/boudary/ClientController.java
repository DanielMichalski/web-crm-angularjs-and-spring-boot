package pl.dmichalski.crm.web.presentation.client.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.web.presentation.client.control.ClientPresentationService;
import pl.dmichalski.crm.web.presentation.client.entity.ClientDTO;

import java.util.Collection;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private ClientPresentationService clientPresentationService;

    @Autowired
    public ClientController(ClientPresentationService clientPresentationService) {
        this.clientPresentationService = clientPresentationService;
    }

    @RequestMapping
    public Collection<ClientDTO> findAllClients() {
        return clientPresentationService.findAll();
    }

}
