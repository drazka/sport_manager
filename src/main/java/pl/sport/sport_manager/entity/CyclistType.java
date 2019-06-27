package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cyclist_type")
public class CyclistType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;

    @OneToMany(mappedBy = "cyclistType")
    List<CompetitionRanking> competitionRankingList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclistType")
    List<GameTeamDetails> gameTeamDetailsList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclistType")
    List<StageRanking> stageRankingList = new ArrayList<>();

}
