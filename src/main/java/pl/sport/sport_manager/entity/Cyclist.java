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
    private Long id;

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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnder25() {
        return isUnder25;
    }

    public void setUnder25(boolean under25) {
        isUnder25 = under25;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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
