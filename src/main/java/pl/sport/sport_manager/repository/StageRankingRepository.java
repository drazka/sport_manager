package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.CyclistType;
import pl.sport.sport_manager.entity.Stage;
import pl.sport.sport_manager.entity.StageRanking;

import java.util.List;

@Repository
public interface StageRankingRepository extends JpaRepository<StageRanking, Long> {

    List<StageRanking> findStageRankingsByStageAndCyclistType(Stage stage, CyclistType cyclistType);

}
