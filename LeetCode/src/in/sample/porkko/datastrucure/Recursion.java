package in.sample.porkko.datastrucure;

public class Recursion {
	
	public static void main(String[] args) {
		
		printFib(10);
		
		
	}

	public static int printFib(int n){
		if(n<=1){
			System.out.println(n);
			return n;
		}else{
			System.out.println(printFib(n-1)+printFib(n-2));
			return printFib(n-1)+printFib(n-2);
		}
		
	}
}
