package com.almi.movierating.backend.controllers.movies;

import com.almi.movierating.backend.beans.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by c309044 on 2017-03-28.
 */
@RestController("/api/genre")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/api/genre/{genre}")
    public Genre findGenreDetails(@PathVariable("genre") String genre) {
        return genreRepository.findByName(genre);
    }

}