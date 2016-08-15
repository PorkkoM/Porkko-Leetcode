package in.porkko.hankcode.java;

import java.util.Comparator;

public class Checker{
	public  Comparator<Player> desc = new Comparator<Player>() {
		@Override
		public int compare(Player o1, Player o2) {
			if(o1.getScore()== o2.getScore()){
                return o1.getName().compareTo(o2.getName());
			}else{
				
				return Integer.compare(o1.getScore(), o2.getScore());
			}
		}
	};
}
