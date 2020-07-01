package com.simbirsoft.tvshows.service;

import com.simbirsoft.tvshows.model.Show;
import com.simbirsoft.tvshows.repository.ShowRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ShowService {

    private ShowRepo showsRepo;

    @Autowired
    ShowService(ShowRepo showsRepo){
        this.showsRepo = showsRepo;
    }

    public List<Show> findAll(){
        return showsRepo.findAll();

    }

    public Show getById(Long id){
        return showsRepo.findById(id).orElse(new Show());
    }

}
