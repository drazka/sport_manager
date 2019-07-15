package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Stage;

import java.util.Date;


@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {

    Stage findById(long Id);

    @Query(value = "select * from stage where end_date < CURRENT_DATE order by id desc limit 1;", nativeQuery = true)
    Stage findLastEnded();

}
