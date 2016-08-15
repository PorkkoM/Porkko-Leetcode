package in.porkko.hankcode.java;

import java.util.HashMap;
import java.util.Map;

public class Player {

	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void MapCheck(){
		Map<String,Integer> myMap= new HashMap<String,Integer>();
		myMap.put(name,score);
		//myMap.containsKey(arg0)
	}
}
