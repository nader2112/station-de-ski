package tn.esprit.infini.stationdeski.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
}
