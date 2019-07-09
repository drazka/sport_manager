package pl.sport.sport_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sport.sport_manager.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
