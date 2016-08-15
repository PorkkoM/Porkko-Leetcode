package in.sample.porkko.example;

public class SwapArray {
	
	public static void main(String[] args) {
		
		int[] nums={1,2,3,4,5,6,7};
		int size = nums.length;
		int first = nums[0];
		int k =0;
		for(int i=1;i<nums.length;i=i+2){
			int second = nums[i];
			nums[k] = second;
			nums[i] = first;
			first=nums[i];
			k=k+2;
		}
		for(int a:nums){
			System.out.println(""+a);
		}
	}

}
