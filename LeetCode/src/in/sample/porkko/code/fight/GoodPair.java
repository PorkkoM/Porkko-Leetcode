package in.sample.porkko.code.fight;

public class GoodPair {
	
	public static void main(String[] args) {
		
		int N=4;
		int[] arr = {1, 3, 2, 4}; 
	    GoodPair gp = new GoodPair();
	    int s =gp.retVal(arr,N);
		System.out.println(""+s);
	}
	
	public int retVal(int[] arr,int N){
		int	t=0;
		int[] pairArray = new int[arr.length];
		int c =0;
		for (int i=0;i<arr.length;i++){
			for (int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==N){
					pairArray[t++] = i;
					pairArray[t++] = j;
					c += i+j;
				}
			}
		}
		System.out.println("cm===="+c);
		int cs=0;
		for(int k=0;k<pairArray.length;k++){
			cs += pairArray[k];
		}
	return cs;
}

}
