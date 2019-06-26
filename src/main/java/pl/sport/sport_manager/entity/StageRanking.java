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
}
