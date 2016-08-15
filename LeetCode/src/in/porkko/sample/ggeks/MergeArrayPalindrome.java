package in.porkko.sample.ggeks;

public class MergeArrayPalindrome {
	public static void main(String[] args) {
		int[] ar={15,6,5,1,9,4,5,6,15};
		System.out.println(makeMerge(ar));
	}
	static int makeMerge(int[] array){
		int ret = 0;
		int len = array.length;
		if(array.length==1){
			return ret;
		}
		for(int i=0,j=len-1;i<=j;){
			if(array[i] == array[j]){
				i++;
				j--;
			}else if(array[i]>array[j]){
				j--;
				array[j]+=array[j+1];
				ret++;
			}else{
				i++;
				array[i]+=array[i-1];
				ret++;
			}
		}
		for(int s:array){
			System.out.println("--->"+s);
		}
		return ret;
	}
}
