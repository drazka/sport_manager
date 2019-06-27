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
    private long id;

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


}
