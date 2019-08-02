package com.capgemini.movieratingservice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieratingservice.model.Rating;
import com.capgemini.movieratingservice.model.UserRating;

@RestController
@RequestMapping("/ratings")

public class MovieRatingController {
	
	
	@GetMapping("/{userId}")
		public UserRating getMovieRatings(@PathVariable String userId) {
		
			if(userId.equals("kamini")) {
				
			List<Rating> ratings=Arrays.asList(new Rating(101,4),new Rating(102,5));
			UserRating userRating=new UserRating("kamini",ratings);
			return userRating;
			
		}
	return null;
	
	}
}
