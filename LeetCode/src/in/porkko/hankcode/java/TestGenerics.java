package in.porkko.hankcode.java;

public class TestGenerics {
	


	public  void printArray(Object[] ob) {
	        final int T=0;
        if(ob[0] instanceof Integer){
        	Integer[] iar = (Integer[])ob;
            for(Integer i:iar){
            	System.out.println(i);
            }
        }
        if(ob[0] instanceof String){
        	String[] iar = (String[])ob;
            for(String i:iar){
            	System.out.println(i);
            }
        }
        
        
  } 

}
