package ma.enset.walletservice.web;

import lombok.RequiredArgsConstructor;
import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api/clients")
@RequiredArgsConstructor
public class ClientClient {
    private final ClientService clientService;
    @GetMapping
    public List<Client> getClient() {
        return clientService.getclients();
    }
    @PostMapping
    public void addClient(Client client) {
        clientService.addclient(client);
    }
}
