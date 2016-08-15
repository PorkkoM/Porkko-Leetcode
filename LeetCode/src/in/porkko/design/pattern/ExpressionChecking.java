package in.porkko.design.pattern;

public class ExpressionChecking {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		
		System.out.println(z);
	}
	
}
