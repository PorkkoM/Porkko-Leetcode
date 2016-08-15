package in.porkko.sample.ggeks;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryQueue {
	public static void main(String[] args) {
		int n=10;
		generateAndprintBinary(n);
	}
	static void generateAndprintBinary(int n){
		Queue<String> qa = new LinkedList<String>();
		qa.add("1");
		while(n>0){
			String s =qa.peek();
			qa.poll();
			System.out.println("--->"+s);
			String s1=s;
			qa.add(s.concat("0"));
			qa.add(s1.concat("1"));
			n--;
		}
		//System.out.println(""+qa.size());
		for(String h:qa){
			System.out.println(""+h);
		}
	}
}
