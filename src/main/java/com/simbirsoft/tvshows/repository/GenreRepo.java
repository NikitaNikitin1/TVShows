package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre,Long> {
}
