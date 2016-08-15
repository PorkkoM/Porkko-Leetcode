package in.sample.porkko.leetjudge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HIndex {
	
	public static void main(String[] args) {
		
		int citations[] = {100};
		int result=0;
		int len = citations.length;
		Map<Integer,Integer> indMap = new HashMap<Integer,Integer>();
		int cnt =0;
		for(int i=0;i<len;i++){
			int fst = citations[i];
			cnt=0;
			for(int j=i;j<len;j++){
				if(fst>=citations[j]){
					cnt++;
				}
			}
			indMap.put(fst, cnt);
			cnt=0;
		}
		if(len!=0){
		 int maxValueInMap=(Collections.max(indMap.values()));
		// System.out.println(maxValueInMap);
	        for (Entry<Integer, Integer> entry : indMap.entrySet()) { 
	            if (entry.getValue()==maxValueInMap) {
	            	result=entry.getKey();     
	            }
	        }
	}
		System.out.println(""+result);
	}
	

}
