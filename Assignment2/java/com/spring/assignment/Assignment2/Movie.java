package com.spring.assignment.Assignment2;

import java.util.Date;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Value("M001")
	private String movieId;
	@Value("The Firm")
	private String movieName;
	@Value("Tom Cruise")
	private String movieActor;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	@PostConstruct
	public void init() {
		Date date= new Date();
		System.out.println("Init Method");
		System.out.println("Current date and time : "+date);
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Destroy Method");
	}
}
