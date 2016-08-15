package in.sample.porkko.leetjudge;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strs[]={"eat", "tea", "tan", "ate", "nat", "bat"};
		List<String> tmp = new ArrayList<String>();
		List<List<String>> returnList = new ArrayList<List<String>>();
		int[] st = new int[strs.length];
		int c=0;
		int h=0;
		for(String sts:strs){
			for(int b:sts.getBytes()){
				c += b;
			}
			st[h]=c;
			h++;
			c=0;
		}
		for(int y=0;y<st.length;y++){
			int f=st[y];
			tmp.add(strs[y]);
			for(int g=y+1;g<st.length;g++){
				if(f == st[g]){
					tmp.add(strs[g]);
				}
			}
			returnList.add(tmp);
			tmp=new ArrayList<String>();
		}
		
		System.out.println(returnList);
	}

}
