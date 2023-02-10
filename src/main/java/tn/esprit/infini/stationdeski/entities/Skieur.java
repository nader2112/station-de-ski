package tn.esprit.infini.stationdeski.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="numSkieur")
    private Long numSkieur;
    private String nonS;
    private String prenomS;
    private Date dateNaissance;

    private String ville;

    @ManyToMany(mappedBy="skieurs")
    private Set<Piste> pistes;

    @OneToMany( mappedBy="skieurs")
    private Set<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnements;
}
