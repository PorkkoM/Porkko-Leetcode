package in.porkko.sample.ggeks;

public class RotateArray_Porkko {
	public static void main(String[] args) {
	    int	nums[] ={1,2,3,4,5,6};
		int k=2;
		 for(int j=0;j<k;j++){
				int temp= nums[0];
				int i=0;
				for(i=0;i<nums.length-1;i++){
					nums[i] = nums[i+1];
				}
				nums[i] =temp;
			}
		 
		 for(int s:nums){
			 System.out.print(""+s);
		 }
	}

}
