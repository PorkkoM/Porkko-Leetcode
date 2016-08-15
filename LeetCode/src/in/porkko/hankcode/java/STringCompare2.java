package in.porkko.hankcode.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class STringCompare2 {
	public static void main(String[] args) {
		String h="am I look Like gentle";
		String[] th = h.split(" ");
		System.out.println(th.length);
		List<String> test = new ArrayList<String>();
		Collections.addAll(test, th);
		STringCompare2 sts = new STringCompare2();
		Collections.sort(test, sts.new SortIgnoreCase());
		System.out.println(""+test);
	}
	public class SortIgnoreCase implements Comparator<String> {
        public int compare(String o1, String o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
	
}
