package com.bae.games.service;

import java.util.List;

import com.bae.games.data.Game;

public interface GameService {

		public void createGame(Game game);

		public List<Game> getlistGame();

		public Game getGame(int id);

		public Game updateGame(int id, Game game);

		public String deleteGame(int id);

		

	}

