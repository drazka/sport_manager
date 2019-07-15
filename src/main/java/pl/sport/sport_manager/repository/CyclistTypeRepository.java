package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.CyclistType;

@Repository
public interface CyclistTypeRepository extends JpaRepository<CyclistType, Long> {

    CyclistType findById(long id);
}
