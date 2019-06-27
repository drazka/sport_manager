package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cyclist")
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private LocalDate dateOfBirth;
    private int age;
    private boolean isUnder25;
    private String country;
    private int height;
    private int weight;

    @ManyToOne
    private Team team;

    @ManyToMany
    List<Competition> competitionList = new ArrayList<>();

    private long price;

    @OneToMany(mappedBy = "cyclist")
    List<CompetitionRanking> competitionRankingList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclist")
    List<GameTeamDetails> gameTeamDetailsList = new ArrayList<>();

    @OneToMany(mappedBy = "cyclist")
    List<StageRanking> stageRankingList = new ArrayList<>();




}
