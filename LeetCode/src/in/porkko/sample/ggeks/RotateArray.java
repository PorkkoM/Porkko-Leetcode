package in.porkko.sample.ggeks;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6};
		int k=2;
		int length=nums.length;
	    int rk=k%length;
	    System.out.println(""+k);
	    int [] copy=new int[length*2];
	    for(int i=0;i<2*length;i++){
	        copy[i]=nums[i%length];
	    }
	    for(int t=length-rk,i=0;t<2*length-rk;t++,i++)
	    {
	        nums[i]=copy[t];

	    } 
		for(int s:nums){
			System.out.print(""+s);
		}
	}

}
