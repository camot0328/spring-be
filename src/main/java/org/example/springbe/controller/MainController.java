package org.example.springbe.controller;

import org.example.springbe.dto.MovieDto;
import org.example.springbe.dto.MoviesDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = RequestMethod.GET)
public class MainController {
  @GetMapping
  public MoviesDto hello() {
    MoviesDto movies = new MoviesDto();
    MovieDto movieDto = new
        MovieDto(1,"testMovie","https://an2-img.amz.wtchn.net/image/v2/FztLWfhyYvbKEUPWo9EufQ.webp?jwt=ZXlKaGJHY2lPaUpJVXpJMU5pSjkuZXlKdmNIUnpJanBiSW1SZk1USTRNSGczTWpCeE9EQWlYU3dpY0NJNklpOTJNaTl6ZEc5eVpTOXBiV0ZuWlM4eE5qRTFPRE15T1RNME5qSXhORGsyTmpZMkluMC5lWHh6b3VxS240TElxSDlsRVI0QS1XY3ZISHVGbGxfX0dvVUhoLXhOSVR3","summaryTest");
        List<MovieDto> moviesList = new ArrayList<>();
    moviesList.add(movieDto);
    movies.setMovies(moviesList);
    return movies;
  }
}
