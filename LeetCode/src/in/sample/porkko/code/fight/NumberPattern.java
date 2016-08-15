package in.sample.porkko.code.fight;

import java.util.ArrayList;
import java.util.List;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		int[] n={1,2,3};
		List<String> retstr = new ArrayList<String>();
		for(int i=1;i<n.length;i++){
			int val = n[i]-n[i-1];
			String str="";
			
		    if(val>=0){
		       str = "+"+val; 
		    }else{
		    	str = String.valueOf(val);
		    }
		    retstr.add(str);
		}
		if(retstr.size()>3){
			
		}else if(retstr.size()==3){
			String s =retstr.get(0);
			if(retstr.get(0)==retstr.get(1)){
				if(retstr.get(1)==retstr.get(2)){
					
				}
			}else{
				
			}
		}
		String []dsf = new String[retstr.size()];
		retstr.toArray(dsf);
		System.out.println(dsf);
	}
}
