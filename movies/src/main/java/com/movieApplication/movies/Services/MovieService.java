package com.movieApplication.movies.Services;

import com.movieApplication.movies.Entity.Movie;
import com.movieApplication.movies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies (){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovies (String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
