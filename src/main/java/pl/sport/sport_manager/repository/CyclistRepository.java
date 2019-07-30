package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sport.sport_manager.entity.Cyclist;

import java.util.List;

@Repository
public interface CyclistRepository extends JpaRepository<Cyclist, Long> {
    List<Cyclist> findCyclistByAgeLessThanEqual(int age);
}
