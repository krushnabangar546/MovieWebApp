package com.movieApplication.movies.Controller;

import com.movieApplication.movies.Entity.Review;
import com.movieApplication.movies.Services.ReviewService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/review")
@CrossOrigin(origins = "*", allowedHeaders = {"Origin", "x-requested-with", "content-type", "Credentials", "Methods"}, methods = {RequestMethod.PUT, RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/post")
    public ResponseEntity<Review> createReview (@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
