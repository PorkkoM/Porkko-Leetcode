package in.porkko.sample.ggeks;

public class StringSubsets {
	public static void main(String[] args) {
		String str="abc";
		testMethod();
		for(int c=0;c<str.length();c++){
			for(int i=0;i<=str.length()-c;i++){
				System.out.println(str.substring(c, c+i));
			}
		}
	}
	static void testMethod(){
		System.out.println(""+Thread.currentThread().getName());
	}
}
