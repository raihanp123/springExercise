package com.bae.games.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.bae.games.data.Game;

@Service
public class GameServiceList implements GameService{
	
	private List<Game> games = new ArrayList<>();

	@Override
	public void createGame(Game game) { 
		this.games.add(game);
	}

	@Override
	public Game getGame(int id) {
		Game found = this.games.get(id);
		return found;
	}
	
	@Override
	public List<Game> getlistGame() {
		return this.games;
	}
	
	@Override
	public String deleteGame(int id) {
		this.games.remove(id);

		return "Deleted kitten at index: " + id;
	}
	
	@Override
    public Game updateGame(int id, Game game) {
      
        this.games.remove(id);
        
        this.games.add(id, game);
        
        return this.games.get(id);
    }

}