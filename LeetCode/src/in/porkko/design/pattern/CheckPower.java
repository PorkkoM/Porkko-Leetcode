package in.porkko.design.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CheckPower {
	public static void main(String[] args) {
		for(int i=0;i<5;++i){
			System.out.println(i);
		}
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		Map<String,String> m = new HashMap<String,String>();
		m.put("homeloan", "sbi");
		m.put("carloan", "icici");
		
		Set<Map.Entry<String,String>> entSet=m.entrySet();
		for ( Entry ent : entSet){
			ent.getKey();
			ent.getValue();
		}
	}
}
