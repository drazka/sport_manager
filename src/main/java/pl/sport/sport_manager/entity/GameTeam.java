package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "game_team")
public class GameTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    private String name;

    @ManyToOne
    private Competition competition;

    private int points;

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
