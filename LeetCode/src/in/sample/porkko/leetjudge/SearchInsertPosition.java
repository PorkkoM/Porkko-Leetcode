package in.sample.porkko.leetjudge;

public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums={1,3};
		int target=0;
		int ret=sip.searchInsert(nums, target);
		System.out.println(""+ret);
	}
	
   public int searchInsert(int[] nums, int target) {
	   int low = 0;
	   int high = nums.length-1;
	   int ret=0;
	   if(nums.length==1){
		   return 1;
	   }
	   while(low<=high){
		   int mid = (low+high)/2;
		   if(nums[mid] == target){
			   ret =mid;
			   break;
		   }else if(target<nums[mid] && nums[mid-1]>target){
			   ret =mid;
			   break;
		   }else{
			   	if(target>nums[mid]){
			   		low=mid;
			   	}else{
                   high=mid;			   		
			   	}
		   }
	   }

      return ret;
    }
}
