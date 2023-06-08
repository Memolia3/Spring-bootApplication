package com.example.demo.pack;

import java.util.Random;

public class EnemyAction {
	private final String[] ACTION = {"いっこつよいこうげき", "こうげき", "いかく"};
	private int randomValue;
	private final int MAX = 2;
	private final int MIN = 1;
	private String action;
	
	EnemyAction(){
		Random rd = new Random();
		randomValue = rd.nextInt(MAX + MIN) + MIN;
		switch(randomValue) {
		case 1:
			this.action = ACTION[0];
			break;
		case 2:
			this.action = ACTION[1];
			break;
		case 3:
			this.action = ACTION[2];
			break;
		}
	}
	
	public String getAction() {
		return this.action;
	}
}
