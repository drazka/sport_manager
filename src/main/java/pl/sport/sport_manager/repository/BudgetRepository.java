package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
