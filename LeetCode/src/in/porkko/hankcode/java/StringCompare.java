package in.porkko.hankcode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompare {

	public static void main(String[] args) {
		
		String str = "Welcometojava";
		 int k = 3;
		 List<String> testList = new ArrayList<String>();
			for(int i=0;i<=str.length()-3;i++){
				int j=0;
				if(testList.size()!=0){
				if(str.substring(i, i+k).compareTo(testList.get(j))<0){
					testList.add(str.substring(i, i+k));
				}else{
					testList.add(testList.size(), str.substring(i, i+k));
				}
				}else{
					testList.add(str.substring(i, i+k));
				}
				j++;
				System.out.println(testList);
			}
			Collections.sort(testList);
			System.out.println(testList);
	}
	
	public class SortIgnoreCase implements Comparator<String> {
        public int compare(String o1, String o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
	
}
