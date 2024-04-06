package com.movieApplication.movies.Controller;

import com.movieApplication.movies.Entity.Movie;
import com.movieApplication.movies.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*", allowedHeaders = {"Origin", "x-requested-with", "content-type", "Credentials", "Methods"}, methods = {RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovies(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovies(imdbId), HttpStatus.OK);
    }

//    @GetMapping(value = "/{imdbId}")
//    public ResponseEntity<BufferedImage> generateMovieQR (Movie moviecode){
//
//    }
}
