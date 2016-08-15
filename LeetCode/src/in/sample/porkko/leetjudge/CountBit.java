package in.sample.porkko.leetjudge;

public class CountBit {
	
	
	
	public static void main(String[] args) {
		int[] retn = new int[5];
		for(int j=0;j<5;j++){
			retn[j]=Integer.bitCount(j);
		}
		for(int d:retn){
		System.out.print(d);
		}
		System.out.println();
		double d =Math.log(16)/Math.log(4);
		System.out.println(d);
		
	}

}
