package tn.esprit.infini.stationdeski.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="numCours")
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    @Enumerated(EnumType.STRING)
    private Support Support;
    private float prix;
    private Integer creneau;

    @OneToMany( mappedBy="cours")
    private Set<Inscription> inscriptions;

}
