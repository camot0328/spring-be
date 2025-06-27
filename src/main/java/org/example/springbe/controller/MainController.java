package org.example.springbe.controller;

import org.example.springbe.dto.MovieDto;
import org.example.springbe.dto.MoviesDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "*", methods = RequestMethod.GET)
public class MainController {
  @GetMapping("")
  public MoviesDto hello() {
    MoviesDto movies = new MoviesDto();
    MovieDto movieDto = new
        MovieDto(1,"testMovie","https://downloadwap.com/thumbs2/wallpapers/p2ls/2019/drawings/41/r9x2z14213412159.jpg","summaryTest");
        List<MovieDto> moviesList = new ArrayList<>();
    moviesList.add(movieDto);
    movies.setMovies(moviesList);
    return movies;
  }
}
