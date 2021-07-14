package com.bae.games.data;

public class Game {

	private String name;
	private String genre;
	private int rating;
	private int cost;
	
	public Game(String name, String genre, int rating, int cost) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.cost = cost;
	}
	
	public Game() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", genre=" + genre + ", rating=" + rating + ", cost=" + cost + "]";
	}
	
}
