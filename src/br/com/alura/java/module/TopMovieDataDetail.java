package br.com.alura.java.module;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TopMovieDataDetail {
	private String id ;
	private String rank;
	private String title;
	private String fullTitle ;
	private String year ;
	private String image ;
	private String crew ;
	private String imdbRating ;
	private String imdbRatingCount ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFullTitle() {
		return fullTitle;
	}
	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbRatingCount() {
		return imdbRatingCount;
	}
	public void setImdbRatingCount(String imdbRatingCount) {
		this.imdbRatingCount = imdbRatingCount;
	}
	
	public String recuperarRankImdb(String url) throws Exception {
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create(url))
		      .build();	
			
		HttpResponse<String> response = 
				client.send(request, BodyHandlers.ofString());
		
		return response.body();

	}
}
