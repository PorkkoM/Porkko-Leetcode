package in.sample.porkko.leetjudge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UglyNumber {
	
	public static void main(String[] args) { 
		int num=2;
		boolean  ret=true;
    long ns = Long.valueOf(num);
	List<Integer> list= new ArrayList<Integer>();
	if(ns== -1 || ns==0){
	    ret=false;
	}else if(ns==1){
	    ret=true;
	}else{
	for(int i=2;i<=Math.abs(ns);i++){
		if(i%i==0){
			list.add(i);
			if(list.size()==3){
             ret = false;
             break;
			}
		}
		
	}
	}
System.out.println(ret);
	}
}
