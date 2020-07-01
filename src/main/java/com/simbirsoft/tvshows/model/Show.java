package com.simbirsoft.tvshows.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate prodDate;

    @Column
    private  String country;

    @Column
    private  String tvChannel;

    @Column
    private  Float ratingKinopoisk;

    @Column
    private  String description;

    @ManyToMany(mappedBy = "shows")
    private List<User> users = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "shows_genres",
            joinColumns = { @JoinColumn(name = "show_id") },
            inverseJoinColumns = { @JoinColumn(name = "genre_id") }
    )
    private List<Genre> genres = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private List<Episode> episodes;

    @Transient
    private Integer usersRating;

    @Transient
    private Integer audience;

}
