package entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@NamedNativeQuery(name = "findBetweenDateNative", query = "select * from machine where dateAchat between :d1 and :d2", resultClass = Machine.class)
@NamedQuery(name = "findBetweenDate", query = "from Machine where dateAchat between :d1 and :d2")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @ManyToOne
    private Salle salle;

    public Machine(String m123, Date date, Salle byId) {
    }

    public Machine() {

    }

    public void setRef(String s) {
    }

    public void setDateAchat(Date date) {
    }

    public void setSalle(Salle salle) {
    }

    public int getId() {
        return 0;
    }

    public double getRef() {
        return 0;
    }

    public double getDateAchat() {
        return 0;
    }

    // Constructeurs, getters et setters
}