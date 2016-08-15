package in.porkko.hacker.earth;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String str ="<h1>The only way to know your power is,keep testing your limits</h1><h2>i am testing here</h2>";
		//StringBuffer sbr = new StringBuffer(str);
//		int si = str.indexOf(">");
//		int ei = str.indexOf("/");
//		System.out.println(str.length());
//		System.out.println("Start Index " +si+ " End Index " +ei  );
//		System.out.println(str.substring(1, si));
//		System.out.println("Splitted String"+str.substring(si+1, ei-1));
//		System.out.println("=====>"+str.substring(ei+1, ei+si));
		while(str.length()>0){
			int si = str.indexOf(">");
			int ei = str.indexOf("/");
			if(str.substring(1, si).toString().equals(str.substring(ei+1, ei+si).toString())){
				System.out.println(str.substring(si+1, ei-1).toString());
			    str = str.substring(ei+si+1, str.length());
				System.out.println("---->"+str);
			}else{
				str = str.substring(ei+si+1, str.length());
				System.out.println(""+str);
			}
			
		}
	}
	
	

}
