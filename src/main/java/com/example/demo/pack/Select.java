package com.example.demo.pack;

import lombok.Data;

@Data
public class Select {
	private String select;

	public String getSelect() {
	      return select;
	}

	public void setSelect(String select) {
	      this.select = select;
	}
	
	public String characterImage(String selecter) {
		switch(selecter) {
		case "ハチワレ":
			return "hachiwareSelecter";
		case "うさぎ":
			return "usagiSelecter";
		case "くりまんじゅう":
			return "kurimanjyuSelecter";
		default:
			return "chiikawaSelecter";
		}
	}
}
