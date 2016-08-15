package in.porkko.sample.ggeks;

public class SumOfContigiousArray {
	public static void main(String[] args) {
		
		int t[]={-2, -3, 4, -1, -2, 1, 5, -3};
		int maxSoFar=0,maxEndHere=0;
		for(int j=0;j<t.length;j++){
			maxEndHere = maxEndHere+t[j];
			if(maxEndHere<0){
				maxEndHere=0;
			}
			if(maxSoFar<maxEndHere){
				maxSoFar=maxEndHere;
			}
		}
		System.out.println(maxSoFar);
	}
}
