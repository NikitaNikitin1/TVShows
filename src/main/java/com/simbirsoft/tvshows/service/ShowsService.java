package com.simbirsoft.tvshows.service;

import com.simbirsoft.tvshows.model.Show;
import com.simbirsoft.tvshows.repository.ShowRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ShowsService {

    private ShowRepo showsRepo;

    @Autowired
    ShowsService(ShowRepo showsRepo){
        this.showsRepo = showsRepo;
    }

    private List<Show> findAll(){
        return showsRepo.findAll();
    }
}
