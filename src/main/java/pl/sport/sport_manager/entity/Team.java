package pl.sport.sport_manager.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "team")
    List<Cyclist> cyclistList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cyclist> getCyclistList() {
        return cyclistList;
    }

    public void setCyclistList(List<Cyclist> cyclistList) {
        this.cyclistList = cyclistList;
    }
}
