package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long budgetAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(long budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
}
