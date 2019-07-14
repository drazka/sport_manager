package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.GameTeamDetails;

@Repository
public interface GameTeamDetailsRepository extends JpaRepository<GameTeamDetails, Long> {
}
