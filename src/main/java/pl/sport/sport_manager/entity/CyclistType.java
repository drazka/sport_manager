package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cyclist_type")
public class CyclistType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @OneToMany(mappedBy = "cyclistType")
    List<CompetitionRanking> competitionRankingList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclistType")
    List<GameTeamDetails> gameTeamDetailsList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclistType")
    List<StageRanking> stageRankingList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CompetitionRanking> getCompetitionRankingList() {
        return competitionRankingList;
    }

    public void setCompetitionRankingList(List<CompetitionRanking> competitionRankingList) {
        this.competitionRankingList = competitionRankingList;
    }

    public List<GameTeamDetails> getGameTeamDetailsList() {
        return gameTeamDetailsList;
    }

    public void setGameTeamDetailsList(List<GameTeamDetails> gameTeamDetailsList) {
        this.gameTeamDetailsList = gameTeamDetailsList;
    }

    public List<StageRanking> getStageRankingList() {
        return stageRankingList;
    }

    public void setStageRankingList(List<StageRanking> stageRankingList) {
        this.stageRankingList = stageRankingList;
    }
}
