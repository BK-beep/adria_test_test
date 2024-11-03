package ma.enset.walletservice.services;
import lombok.RequiredArgsConstructor;
import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.repos.ClientRepository;
import ma.enset.walletservice.repos.WalletRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientService {
    private final ClientRepository clientRepository;
    public List<Client> getclients(){
        return clientRepository.findAll();
    }
    public void addclient(Client client){
        clientRepository.save(client);
    }
    public void deleteclient(Integer id){
        clientRepository.deleteById(id);
    }
    public Client getclient(Integer id){
        return clientRepository.findById(id).orElse(null);
    }
    public void updateclient(Integer id, Client client){
        client.setId(id);
        clientRepository.save(client);
    }

}
