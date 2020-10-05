package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepo extends JpaRepository<Episode,Long> {
}
