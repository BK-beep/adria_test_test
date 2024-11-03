package ma.enset.transfersservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String date;
    private String source;
    private String destination;
    private double montant;
    private String etat;
}
