package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Watching;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchingRepo extends JpaRepository<Watching,Long> {
}
