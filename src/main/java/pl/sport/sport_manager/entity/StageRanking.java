package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "stage_ranking")
public class StageRanking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Stage stage;

    @ManyToOne
    private Cyclist cyclist;

    @ManyToOne
    private CyclistType cyclistType;

    private int place;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Cyclist getCyclist() {
        return cyclist;
    }

    public void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }

    public CyclistType getCyclistType() {
        return cyclistType;
    }

    public void setCyclistType(CyclistType cyclistType) {
        this.cyclistType = cyclistType;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
