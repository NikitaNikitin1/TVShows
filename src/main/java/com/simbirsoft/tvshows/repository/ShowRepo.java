package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShowRepo extends JpaRepository<Show,Long> {
}
