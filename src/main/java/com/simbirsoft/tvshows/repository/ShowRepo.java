package com.simbirsoft.tvshows.repository;

import com.simbirsoft.tvshows.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ShowRepo extends JpaRepository<Show,Long> {

    Optional<Show> findById(Long id);

}
