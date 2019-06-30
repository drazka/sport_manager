package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "game_team_details")
public class GameTeamDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GameTeam getGameTeam() {
        return gameTeam;
    }

    public void setGameTeam(GameTeam gameTeam) {
        this.gameTeam = gameTeam;
    }

    public Cyclist getCyclist() {
        return cyclist;
    }

    public void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }

    public boolean isCapitan() {
        return isCapitan;
    }

    public void setCapitan(boolean capitan) {
        isCapitan = capitan;
    }

    public CyclistType getCyclistType() {
        return cyclistType;
    }

    public void setCyclistType(CyclistType cyclistType) {
        this.cyclistType = cyclistType;
    }

    public int getCyclistPoints() {
        return cyclistPoints;
    }

    public void setCyclistPoints(int cyclistPoints) {
        this.cyclistPoints = cyclistPoints;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
