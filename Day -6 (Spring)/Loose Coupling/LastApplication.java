package com.example.last;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.last.game.GameRunner;
import com.example.last.game.MarioGame;
import com.example.last.game.SuperContraGame;

@SpringBootApplication
public class LastApplication {

	public static void main(String[] args) {
	MarioGame game = new MarioGame();
//SuperContraGame game = new SuperContraGame();	
//	SpringApplication.run(LastApplication.class, args);
	GameRunner runner = new GameRunner(game);

	runner.runGame();
	
	
	
	
	}

}
