package in.porkko.sample.ggeks;

public class BadVersion {

	public static void main(String[] args) {
		int n=2126753390;
		int first =0,last =n-1, mid = n/2;
		boolean firstCheck = false;
		boolean midCheck = true;
		boolean lastCheck =true;
		if(firstCheck){
			System.out.println("First Version is wrong");
		}else if(!firstCheck && midCheck){
			first =0;
			last = mid;
			mid = (first+last)/2;
		}else if(midCheck && lastCheck){
			first =mid;
			last = n-1;
			mid = (first+last)/2;
		}
		while(first<=last){
			if(!isBadVersion(mid)){
				first  = mid+1;
			}else if(isBadVersion(mid)){
				System.out.println("Find At Location---"+(mid+1));
				break;
			}else{
				last = mid-1;
			}
			mid=(last+first)/2;
		}
		
	}
	
	public static boolean isBadVersion(int n){
		
		boolean isCheck =true;
		return false;
	}
	
}
  