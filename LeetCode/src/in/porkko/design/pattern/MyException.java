package in.porkko.design.pattern;

public class MyException extends Exception {
	
	String mg;
	
	 public MyException() {
		// TODO Auto-generated constructor stub
	}
	 
	 public MyException(String msg){
		 this.mg=msg;
	 }

	 @Override
	 public String toString(){
		 return mg;
	 }
}
