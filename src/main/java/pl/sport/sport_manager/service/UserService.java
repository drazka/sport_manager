package pl.sport.sport_manager.service;

import pl.sport.sport_manager.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
