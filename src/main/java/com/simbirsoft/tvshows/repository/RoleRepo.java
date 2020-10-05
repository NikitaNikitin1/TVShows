package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
}
