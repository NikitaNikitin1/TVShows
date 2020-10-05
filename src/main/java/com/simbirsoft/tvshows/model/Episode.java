package com.simbirsoft.tvshows.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="id_show")
    private Show shows;

    @Column
    private LocalDate releaseDate;

    @Column
    private String name;

    @Column
    private Integer season;

    @Column
    private Integer episodeNumbers;

    @Column
    private Integer runTime;

    @Transient
    @ManyToMany(mappedBy = "episodes")
    private List<User> users = new ArrayList<>();
}
