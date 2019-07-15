package pl.sport.sport_manager.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "competition")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToMany(mappedBy = "competitionList")
    private List<Cyclist> cyclistList = new ArrayList<>();

    @OneToMany(mappedBy = "competition")
    List <CompetitionRanking> competitionRankingList = new ArrayList<>();

    @OneToMany( mappedBy = "competition")
    List<GameTeam> gameTeamList = new ArrayList<>();

    @OneToMany(mappedBy = "competition")
    List<Stage> stageList = new ArrayList<>();

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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Cyclist> getCyclistList() {
        return cyclistList;
    }

    public void setCyclistList(List<Cyclist> cyclistList) {
        this.cyclistList = cyclistList;
    }

    public List<CompetitionRanking> getCompetitionRankingList() {
        return competitionRankingList;
    }

    public void setCompetitionRankingList(List<CompetitionRanking> competitionRankingList) {
        this.competitionRankingList = competitionRankingList;
    }

    public List<GameTeam> getGameTeamList() {
        return gameTeamList;
    }

    public void setGameTeamList(List<GameTeam> gameTeamList) {
        this.gameTeamList = gameTeamList;
    }

    public List<Stage> getStageList() {
        return stageList;
    }

    public void setStageList(List<Stage> stageList) {
        this.stageList = stageList;
    }
}
