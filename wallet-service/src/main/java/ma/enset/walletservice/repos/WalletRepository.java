package ma.enset.walletservice.repos;

import ma.enset.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WalletRepository extends JpaRepository<Wallet, String> {

}
