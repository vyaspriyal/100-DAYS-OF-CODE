package com.example.last.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class GameRunner {
	
	@Autowired
	private GamingConsole game;
	
//	public GameRunner(MrioGame gaame) {
//		this.game = game;
//		// TODO Auto-generated constructor stub
//	}
	public GameRunner(GamingConsole game) {
		this.game = game;
		// TODO Auto-generated constructor stub
	}
	public void runGame() {
		game.up();
		game.down();
		game.right();
		game.left();
	}
	

	
	

}
