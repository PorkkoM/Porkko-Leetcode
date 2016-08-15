package in.sample.porkko.example;

public class TwoSums {

	public static void main(String[] args) {
		
		int[] nums ={2, 7, 11, 15};
		int target=9;
		int[] ret={0,0};
		int a,b;
	
		for(int i=0;i<nums.length;i++){
			a=nums[i];
			for(int j=i+1;j<nums.length;j++){
				if(a+nums[j]== target){
					b=nums[j];
					break;
				}
			}
		}
	}
}
