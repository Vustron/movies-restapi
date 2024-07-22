package dev.vustron.movies.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.vustron.movies.models.Review;
import dev.vustron.movies.services.ReviewService;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {
  
  @Autowired
  private ReviewService reviewService;
  
  @PostMapping()
  public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
    return new ResponseEntity<Review>(
      reviewService.createReview(
        payload.get("reviewBody"), 
        payload.get("imdbId")), 
        HttpStatus.OK
    );
  }
}
