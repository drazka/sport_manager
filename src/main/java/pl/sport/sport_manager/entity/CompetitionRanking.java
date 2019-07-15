package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "competition_ranking")
public class CompetitionRanking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Competition competition;

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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
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
