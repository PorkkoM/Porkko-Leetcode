package in.porkko.sample.ggeks;

public class SubArraySUm {
	
	public static void main(String[] args) {
		
		int[] arr={1,4,0,0,3,10,5};
		int sum=7;
		int curr_sum=arr[0],start=0,i;
		for(i=1;i<=arr.length;i++){
			while(curr_sum>sum && start<i-1){
				curr_sum = curr_sum-arr[start];
				start++;
			}
			if(curr_sum == sum){
				System.out.println("The sum found between the following "+start+" and "+(i-1));
				return;
			}
			if(i<arr.length){
				curr_sum=curr_sum+arr[i];
			}
		}
		System.out.println("No Sub Array Found");
	}
}
