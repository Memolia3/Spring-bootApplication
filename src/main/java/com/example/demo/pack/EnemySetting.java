package com.example.demo.pack;

import java.util.Random;

import lombok.Data;

@Data
public class EnemySetting {
	private final String[] ENEMY = {"ゴブリン", "グーチョキパーうさぎ", "おめんキメラ"};
	private final String[] ENEMYIMAGE = {"goblin", "rspusagi", "omenchimera"};
	private int randomValue;
	private final int MAX = 2;
	private final int MIN = 1;
	private String name;
	private String imageName;
	EnemyStatus es;
	
	EnemySetting(){
		Random rd = new Random();
		randomValue = rd.nextInt(MAX + MIN) + MIN;
		switch(randomValue) {
		case 1:
			this.name = ENEMY[0];
			this.imageName = ENEMYIMAGE[0];
			es = new EnemyStatus();
			break;
		case 2:
			this.name = ENEMY[1];
			this.imageName = ENEMYIMAGE[1];
			es = new EnemyStatus();
			break;
		case 3:
			this.name = ENEMY[2];
			this.imageName = ENEMYIMAGE[2];
			es = new EnemyStatus();
			break;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getImageName() {
		return this.imageName;
	}
}
