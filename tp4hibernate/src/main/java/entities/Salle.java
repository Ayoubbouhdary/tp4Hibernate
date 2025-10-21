package entities;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;

    public Salle() {
    }

    public int getId() {
        return 0;
    }

    public void setCode(String a101) {
    }

    public double getCode() {
        return 0;
    }

    public Machine[] getMachines() {
        return new Machine[0];
    }

    // Constructeurs, getters et setters
}