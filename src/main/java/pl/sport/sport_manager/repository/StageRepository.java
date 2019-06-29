package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Stage;

import java.util.List;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {
    List<Stage> findStagesById(long Id);
}
