package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "game_team_details")
public class GameTeamDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private GameTeam gameTeam;

    @ManyToOne
    private Cyclist cyclist;

    private boolean isCapitan;

    @ManyToOne
    private CyclistType cyclistType;

    private int cyclistPoints;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;

    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updated = LocalDateTime.now();
    }




}
