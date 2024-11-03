package ma.enset.walletservice.repos;

import ma.enset.walletservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
