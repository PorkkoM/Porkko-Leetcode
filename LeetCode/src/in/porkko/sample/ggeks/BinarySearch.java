package in.porkko.sample.ggeks;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int n[] ={1,2,3,4,5,6,7,8,9};
		int searchElem  = 10;
		int len = n.length;
		int first=0,last=len-1,mid=(first+last)/2;
		while(first<=last){
			if(n[mid] < searchElem){
				first  = mid+1;
			}else if(n[mid] == searchElem){
				System.out.println("Find At Location---"+(mid+1));
				break;
			}else{
				last = mid-1;
			}
			mid=(last+first)/2;
		}
	}
}
