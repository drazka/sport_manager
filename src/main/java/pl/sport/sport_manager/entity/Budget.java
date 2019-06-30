package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long budgetaAmount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBudgetaAmount() {
        return budgetaAmount;
    }

    public void setBudgetaAmount(long budgetaAmount) {
        this.budgetaAmount = budgetaAmount;
    }
}
