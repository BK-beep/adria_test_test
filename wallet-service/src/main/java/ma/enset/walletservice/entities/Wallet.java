package ma.enset.walletservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double solde;
    private String devise;
    private String dateCreation;
    private Integer clientId;
}
