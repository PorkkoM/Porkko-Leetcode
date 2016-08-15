package in.sample.porkko.leetjudge;

public class ProductWithoutSelf {
	public static void main(String[] args) {
		int[] nums={0,40,0};
		int[] newsarr = sendarry(nums);
		for(int s:newsarr){
			System.out.println(s);
		}
	}
	
	static int[] sendarry(int[] nums){

		
		if(nums == null || nums.length == 0){
           // return null;
        }
        if(nums.length==2){
		    int temp1 = nums[0];
		    nums[0] =nums[1];
		    nums[1]=temp1;
		  //  return nums;
		}
       boolean zeroFirstFlag=false;
		int temp=1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0 && !zeroFirstFlag){
				zeroFirstFlag=true;
			}else if(zeroFirstFlag && nums[i]==0){
				temp=0;
				for(int j=0;i<nums.length;j++){
						nums[j]=0;
				}
				break;
			}
			else{
					temp *= nums[i];
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0 && !zeroFirstFlag){
				nums[i] = temp/nums[i];
				
			}else if(nums[i]==0 && zeroFirstFlag ){
				nums[i]=temp;
			}else if(nums[i]!=0 && zeroFirstFlag ){
				nums[i]=temp;
			}
		}
        

      return nums;

    
		
	}
}
