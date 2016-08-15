package in.sample.mca;

import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Hello.x);
		TreeSet s1 = new TreeSet();
		TreeSet sub = new TreeSet();
		for(int i=604;i<617;i++){
			if(i%2==0){
				s1.add(i);
			}
		}
		sub = (TreeSet)s1.subSet(606, 613);
		s1.add(629);
	//	sub.add(629);
		System.out.println(s1+"  "+sub);
				
	}	

}
