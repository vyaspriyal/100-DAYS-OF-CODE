package com.example.last.game;

public class SuperContraGame implements GamingConsole{
	
	@Override
	public void  up() {
		System.out.println("up");
		
	}
	@Override
	public void down() {
		System.out.println("down");
	}
	@Override
	public void right() {
		System.out.println("right");
	}
	@Override
	public void left() {
		System.out.println("left");
	}


}


