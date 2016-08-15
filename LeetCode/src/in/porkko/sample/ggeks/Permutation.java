package in.porkko.sample.ggeks;

public class Permutation {
	
	public static void main(String[] args) {
		
		String fg ="";
		System.out.println(new Permutation().fact(4));
	}
	
	int fact(int n){
		return (n==1)?1:n*fact(n-1);
	}

}
