package in.porkko.hankcode.java;

public class TimeConversion {
	
	public static void main(String[] args) {
		String str = "12:20:00AM";
		if(str.indexOf("PM")>0){
			int in  = Integer.valueOf(str.substring(0,2));
			if(in!=12){
				in = in+12;
			}
			str =String.valueOf(in)+str.substring(2, str.length());
			str = str.substring(0,str.length()-2);
		}else if(str.indexOf("AM")>0 && str.indexOf("12")==0){
			str ="00"+str.substring(2, str.length());
			str = str.substring(0,str.length()-2);
		}
		else{
			str = str.substring(0,str.length()-2);
		}
		
		System.out.println(""+str);
	}

}
