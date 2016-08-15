package in.sample.porkko.leetjudge;

public class PlusOne {
	
	public static void main(String[] args) {
		
	  int[] n ={9,8,7,6,5,4,3,2,1,0};
	  int a=2147483647+1;
	  int b=987654321+1;
	  int _XX = 0b10000000000000000000000000000000;
	  int _33 = 0b10000000000000000000000000000001;
	  System.out.println( " _33 = " + _33 );
	  System.out.println( " _xx = " + _XX );
	  System.out.println(a);
	  String ret="";
	  for(int i=0;i<n.length;i++){
		  ret += String.valueOf(n[i]);
	  }
	  Integer tot = Integer.parseInt(ret)+1;
	  ret = String.valueOf(tot);
	  int[] se = new int[ret.length()];
	  for(int i=0;i<ret.length();i++){
		  se[i] = Integer.valueOf(ret.charAt(i));
	  }
	  System.out.println(""+se.length);
	}

}
