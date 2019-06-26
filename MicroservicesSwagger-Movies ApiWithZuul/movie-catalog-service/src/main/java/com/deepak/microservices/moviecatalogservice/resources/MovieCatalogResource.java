package com.deepak.microservices.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deepak.microservices.moviecatalogservice.models.CatalogItem;
import com.deepak.microservices.moviecatalogservice.models.Movie;
import com.deepak.microservices.moviecatalogservice.models.UserRating;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/catalog")
@Api(description="shows the movie catalog resource end point api")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		// 1. Get all movie related Ids
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId , UserRating.class);		

		return ratings.getUserRating().stream().map( rating -> {
			// 2. For all movieiD, call movie-info-service and get details
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
			// 3. Put them all together
			return new CatalogItem(movie.getName(), "livein realtion movie", rating.getRating());
		}).collect(Collectors.toList());

		

//		List<CatalogItem> catalogItemList= new ArrayList<>();
//		catalogItemList.add(new CatalogItem("luka chhupi","livein realtion movie", 5));
//		catalogItemList.add(new CatalogItem("Gully Boy","wrapper movie", 4));		
//		catalogItemList.add(new CatalogItem("badla","revenge movie", 3));
//		return catalogItemList;
	}
}

// Asynchronous call using Rx-java reactive
/*
 * 	Movie movie = webClientBuilder.build()
 * 				  .get()
 * 				  .uri("")
 * 				  .retrieve()
 * 				  .bodyToMono(className.class)
 * 				  .block(); // if want synchronous version
 * 
*/
