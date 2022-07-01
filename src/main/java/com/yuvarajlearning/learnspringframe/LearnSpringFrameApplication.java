package com.yuvarajlearning.learnspringframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yuvarajlearning.learnspringframe.game.GameRunner;
import com.yuvarajlearning.learnspringframe.game.MarioGame;
import com.yuvarajlearning.learnspringframe.game.SuperContra;

@SpringBootApplication
public class LearnSpringFrameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameApplication.class, args);
		MarioGame game=new MarioGame();
		//SuperContra game1=new SuperContra();
		//GameRunner runn=new GameRunner(game);
		GameRunner runn=context.getBean(GameRunner.class);
		System.out.println("Controls of Mario");
		System.out.println();
		runn.runGame();
		System.out.println();
	//	System.out.println("Controls of Contra Super");
		//runn.game1();
		
	}

		

}
