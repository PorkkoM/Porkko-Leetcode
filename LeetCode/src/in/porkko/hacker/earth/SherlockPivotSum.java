package in.porkko.hacker.earth;

public class SherlockPivotSum {
	
	public static void main(String[] args) {
		int[] ar = {1,1,1};
		SherlockPivotSum sc = new SherlockPivotSum();
		System.out.println(""+sc.validate(ar));
	}

	public boolean validate(int[] array){
		int i = 0;
	    int j = array.length - 1;
	    int sum = 0;
	    while (i != j) {
	        if(sum >= 0) {
	            sum -= array[j];
	            j--;
	        } else {
	            sum +=array[i];
	            i++;
	        }

	    }
	    return sum == 0 ? true : false;
	}
}
