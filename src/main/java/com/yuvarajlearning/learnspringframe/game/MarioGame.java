package com.yuvarajlearning.learnspringframe.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame {
	
	public void Up() {
		System.out.println("Jump");
	}
	public void Down() {
		System.out.println("Scroll");
	}public void Left() {
		System.out.println("Move Left");
	}public void Right() {
		System.out.println("Move Right");
	}
	public void Standby() {
		System.out.println("Standby in the place"); 
	}
}
