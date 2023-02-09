package tn.esprit.infini.stationdeski.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="numInscription")
    private Long numInscription;
    private Integer numSemaine; // Clé primaire

}
