package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Competition;

@Repository
public interface CompetitionRepository  extends JpaRepository<Competition, Long>  {
    Competition findById(long id);
}
