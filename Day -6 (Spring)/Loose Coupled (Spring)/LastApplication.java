package com.example.last;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.last.game.GameRunner;
import com.example.last.game.MarioGame;
import com.example.last.game.SuperContraGame;

@SpringBootApplication
public class LastApplication {

	public static void main(String[] args) {
	//MarioGame game = new MarioGame();
//SuperContraGame game = new SuperContraGame();	
	ConfigurableApplicationContext context = SpringApplication.run(LastApplication.class, args);
	GameRunner runner = context.getBean(GameRunner.class);
	
//	GameRunner runner = new GameRunner(game);

	runner.runGame();
	
	
	
	
	}

}
