package in.porkko.sample.ggeks;

public class SquareeRootBinary {

	public static void main(String[] args) {

     int n=11;
     int start=0,end=n;
     
     int ans=0;
     while(start<=end){
    	 int mid = (start+end)/2;
    	 if((mid*mid)==n){
    		 System.out.println(mid);
    		 break;
    	 }else if((mid*mid)>n){
    		end=mid-1;
    	 }else if((mid*mid)<n){
    		 start = mid+1;
    		 ans = mid;
    	 }
     }
     System.out.println(ans);

	}

}
