package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.ShowGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowGenreRepo extends JpaRepository<ShowGenre,Long> {
}
