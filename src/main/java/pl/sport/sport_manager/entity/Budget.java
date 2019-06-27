package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long budgetaAmount;

    @ManyToOne
    private User user;

    @OneToOne
    private GameTeam gameTeam;

}
