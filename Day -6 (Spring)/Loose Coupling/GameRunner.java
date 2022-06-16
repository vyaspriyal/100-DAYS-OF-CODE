package com.example.last.game;

public class GameRunner {
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
