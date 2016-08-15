package in.porkko.hankcode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutSticks {
	
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(5);
		ints.add(4);
		ints.add(4);
		ints.add(2);
		ints.add(2);
		ints.add(8);
		Collections.sort(ints);
//		int[] arr = {5,4,4,2,2,8};
//        Arrays.sort(arr);	
        boolean chkFlag = true;
        System.out.println(ints.size());
        Collections.sort(ints);
		while(chkFlag){
			int min = ints.get(0);
		//	ints = new ArrayList<Integer>();
			for(Integer as:ints){
				if(as-min!=0){
					ints.add(as);
				}
			}
			System.out.println(ints.size());
			if(ints.size()==1){
				chkFlag = false;
			}
		}
	}

}
