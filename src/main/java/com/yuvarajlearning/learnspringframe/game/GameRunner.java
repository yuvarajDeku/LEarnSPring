package com.yuvarajlearning.learnspringframe.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private MarioGame game;
	private SuperContra game1;
	public GameRunner(MarioGame game) {
		// TODO Auto-generated constructor stub
		this.game=game;
		
	}

	public void runGame() {
		game.Down();
		game.Left();
		game.Up();
		game.Right();
		game.Up();
		game.Standby();
	}
	public void game1() {
		game1.Down();
		game1.Fire();
		game1.Punch();
		game1.Up();
		game1.Standby();
	}

}
