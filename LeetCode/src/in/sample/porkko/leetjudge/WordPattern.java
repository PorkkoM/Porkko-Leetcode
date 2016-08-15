package in.sample.porkko.leetjudge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordPattern {

	public static void main(String[] args) {
		String pattrn = "abba";
		String str = "dog cat cat dog";
		boolean testFlag = true;
        Map<String,String> inbStrMap= new HashMap<String,String>();
		String[] brkPa = str.split(" ");
		if(pattrn.length() != brkPa.length){
			return;
		}
		for(int i=0;i<pattrn.length();i++){
			String temp = String.valueOf(pattrn.charAt(i));
			String patChk = brkPa[i];
			if(inbStrMap.containsKey(temp)){
				String chkValue = inbStrMap.get(temp);
				if(chkValue.equals(patChk)){
					testFlag=false;
					break;
				}
			}else if(inbStrMap.containsValue(patChk)){
				String testKey="";
				for (Entry<String, String> entry : inbStrMap.entrySet()) {
					if (entry.getValue().equals(patChk)) {
						testKey=entry.getKey();
		                break;
		            }
			    }
				if(testKey.equals(temp)){
					testFlag=false;
					break;
				}
			}
			else {
				inbStrMap.put(temp, patChk);
			}
		}
       System.out.println(""+testFlag);
	}

}
