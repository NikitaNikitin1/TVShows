package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
