package pl.sport.sport_manager.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stage")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String place;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne
    private Competition competition;

    @OneToMany(mappedBy = "stage")
    List<StageRanking> stageRankingsList = new ArrayList<>();
}
