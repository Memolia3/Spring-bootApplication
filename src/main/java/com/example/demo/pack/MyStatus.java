package com.example.demo.pack;

public class MyStatus {
	private int hp;
	
	MyStatus(){
		this.hp = 5;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public String getHpImage() {
		switch(this.hp) {
		case 4:
			return "4HpBar";
		case 3:
			return "3HpBar";
		case 2:
			return "2HpBar";
		case 1:
			return "1HpBar";
		case 0:
			return "0HpBar";
		default:
			return "5HpBar";
		}
	}
	
	public void attacked(int damage) {
		this.hp -= damage;
	}
	
	public void gard() {
		this.hp += 1;
	}
}
