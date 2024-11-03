package ma.enset.transfersservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Wallet {
    private String id;
    private double solde;
    private String devise;
    private String dateCreation;
    private Double montant;
    private Etat etat;
}
