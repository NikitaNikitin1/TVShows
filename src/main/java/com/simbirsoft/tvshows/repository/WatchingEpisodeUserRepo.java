package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.WatchingEpisodeUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchingEpisodeUserRepo extends JpaRepository<WatchingEpisodeUser,Long> {
}
