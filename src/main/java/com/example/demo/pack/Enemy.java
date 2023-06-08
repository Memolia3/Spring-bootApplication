package com.example.demo.pack;

import java.util.Random;

public class Enemy {
	private final String[] enemy = {"ゴブリン", "グーチョキパーうさぎ"};
	private int randomValue;
	private final int max = 2;
	private final int min = 1;
	private String name;
	
	Enemy(){
		Random rd = new Random();
		randomValue = rd.nextInt(max + min) + min;
		switch(randomValue) {
		case 1:
			this.name = enemy[0];
			break;
		case 2:
			this.name = enemy[1];
			break;
		}
	}
	
	public String getName() {
		return this.name;
	}
}
