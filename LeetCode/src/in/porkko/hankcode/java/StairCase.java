package in.porkko.hankcode.java;

public class StairCase {

	public static void main(String[] args) {
		
		String lit = "#";
		int n=6;
		for(int i=1;i<=n;i++){
			int sp=i;
			while(sp<=n-1){
				System.out.print(" ");
				sp++;
			}
			int st = i;
			while(st>0){
				System.out.print("#");
				st--;
			}
			System.out.println();
		}
	}
}
