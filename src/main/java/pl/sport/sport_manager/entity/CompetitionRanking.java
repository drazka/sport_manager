package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "competition_ranking")
public class CompetitionRanking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Competition competition;

    @ManyToOne
    private Cyclist cyclist;

    @ManyToOne
    private CyclistType cyclistType;

    private int place;
}
