package in.sample.porkko.test;

public class ProbablityArray {
	
	public static void main(String[] args) {
		int[] ar={-3,1,3,5,7};
		int target = 6;
		System.out.println(findways(ar, 0,target));
		return;
	}
	static int findways(int[] ar,int i,int h){
		if(ar.length >= i && h!=0){
			return 0;
		}
		if(h==0){
			return 1;
		}
		return findways(ar, i+1, h)+findways(ar, i+1, h-ar[i])+findways(ar, i, h+ar[i]);
		
	}

}
