package in.sample.porkko.code.fight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args) {
		int[] A={10,10,10,15,20,20,25,25,30,7000};
		int[] B={10,15,20,20,27,7200};
		Map<Integer,Integer> mA = new HashMap<Integer,Integer>();
		Map<Integer,Integer> mB = new HashMap<Integer,Integer>();
		int ct=1;
		for(int a:A){
           if(!mA.containsKey(a)){
        	   mA.put(a,ct);
           }else{
        	   int dt  = mA.get(a);
        	   dt++;
        	   mA.put(a, dt++);
           }
		}
		for(int b:B){
	           if(!mB.containsKey(b)){
	        	   mB.put(b,ct);
	           }else{
	        	   int dumCount  = mB.get(b);
	        	   dumCount++;
	        	   mB.put(b, dumCount++);
	           }
	  	}
		Map<Integer,Integer> temp = new HashMap<>();
		for (Map.Entry<Integer, Integer> e1 : mB.entrySet()) {
		          int dt = e1.getKey();
		          int dl = e1.getValue();
		          if(mA.containsKey(dt)){
		        	  int dl1 = mA.get(dt);
		        	  if(dl1==dl){
		        		  temp.put(dt, 0);
		        		  mA.remove(dt);
		        	  }else if(dl1!=dl){
		        		  mA.remove(dt);
		        	  }
		          }
		          else{
		        	  temp.put(dt, 0);
		          }
		}
		mA.putAll(temp);
		int[] tr = new int[mA.size()];
		int c=0;
		for (Map.Entry<Integer, Integer> e : mA.entrySet()) {
		    tr[c] = e.getKey();
			c++;
		}
		Arrays.sort(tr);
		
		for(int d:tr){
			System.out.println(d);
		}
		
	}

}
