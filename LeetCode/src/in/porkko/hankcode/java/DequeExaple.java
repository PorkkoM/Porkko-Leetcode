package in.porkko.hankcode.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class DequeExaple {

	public static void main(String[] args) {
		
		int n[] = {5, 3, 5, 2, 3, 2};
		int sp = 3;
		
		 Deque deque = new ArrayDeque<>();
		 int max =0;
		 for(int v:n){
			 deque.add(v);
			 if(deque.size()==3){
				 System.out.println(deque.toString());
				 Set st = new HashSet();
				 st.addAll(deque);
				 if(st.size()>max){
					 max= st.size();
				 }
				 deque.removeFirst();
				 System.out.println(deque.toString());
			 }
			
		 }
		System.out.println(deque.toString());
	}
	
}
