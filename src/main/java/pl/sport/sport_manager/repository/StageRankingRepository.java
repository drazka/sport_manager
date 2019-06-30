package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;

import java.util.List;

@Repository
public interface StageRankingRepository extends JpaRepository<StageRanking, Long> {

    List<StageRanking> findStageRankingsByStage(Stage stage);

}
