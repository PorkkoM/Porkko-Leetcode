package in.sample.porkko.code.fight;

public class SeriesAscOrDesc {
	public static void main(String[] args) {
		int[] thr={1,2,3,4,5,6,7,8,9};
		boolean ascFlag=false;
		boolean descFlag = false;
		boolean unsoreted=false;
		for(int i=0,j=thr.length-1;i<thr.length-1;i++,j--){
			if(!(thr[i]>thr[i+1])){
				ascFlag=true;
			}
			if(!(thr[j]<thr[j-1])){
				descFlag = true;
			}
			if(ascFlag && descFlag ){
				unsoreted=true;
				break;
			}
		}
		if(unsoreted){
			System.out.println("Unsorted");
		}
		if(ascFlag){
			System.out.println("ascending");
		}
		if(descFlag){
			System.out.println("descending");
		}
	}
}
