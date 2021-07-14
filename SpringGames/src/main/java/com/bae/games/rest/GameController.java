package com.bae.games.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.games.data.Game;
import com.bae.games.service.GameService;

@RestController
public class GameController {

	private GameService service;
	
	public GameController(GameService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}
	
	@PostMapping("/createGame") // creates a new game
	public void createGame(@RequestBody Game game) { 
		this.service.createGame(game);
		
	}
	
	@GetMapping("/getGame/{id}") // lists game specified by the ID
	public Game getGame(int id) {
		return this.service.getGame(id);
	}
	
	@GetMapping("/listGame") // lists all the games
	public List<Game> listGame(Game game) {
		return this.service.getlistGame();
	}

	@DeleteMapping("/deleteGame/{id}") // deletes a game and shifts indexes
	public String deleteGame(@PathVariable int id) {
		return this.service.deleteGame(id);
	}
	 
	 @PutMapping("/update") // removes a game, adds a new game and returns it
	    public Game updateGame(@PathParam("id") int id, @RequestBody Game game) {
		 return this.service.updateGame(id, game);
	    }
    }


