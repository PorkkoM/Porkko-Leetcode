package in.porkko.sample.ggeks;

public class FIndSmallesMissingNumber {
	
	public static void main(String[] args) {
		
	int[] a={0,1,2,3,4,5,6,7,10};	
		System.out.println(findFirstMissing(a, 0, a.length-1));
	}
	static int findFirstMissing(int a[],int start,int end){
		if(start>end){
			return end+1;
		}
		if(start!=a[start]){
			return start;
		}
		int mid=(start+end)/2;
		if(a[mid]>mid)
			return findFirstMissing(a, start, mid);
		else
			return findFirstMissing(a, mid+1, end);
		
	}

}
