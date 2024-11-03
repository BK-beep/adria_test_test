package ma.enset.transfersservice.repositories;

import ma.enset.transfersservice.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, String> {
}
