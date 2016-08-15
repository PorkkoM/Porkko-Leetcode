package in.porkko.hacker.earth;

public class OddEvenSort {
	
	public static void main(String[] args) {
		
	
    int array[] = {12,9,4,99,120,1,3,10,13};
    int n= array.length;
    for (int i = 0; i < n/2; i++ ) {
	    	  for (int j = 0; j+1 < n; j += 2)
		    	  if (array[j] > array[j+1]) {
			    	  int T = array[j];
			    	  array[j] = array[j+1];
			    	  array[j+1] = T;
		    	  }
	    	  for (int j = 1; j+1 < array.length; j += 2)
		    	  if (array[j] > array[j+1]) {
			    	  int T = array[j];
			    	  array[j] = array[j+1];
			    	  array[j+1] = T;
		    	  }
    	  }
    for(int i = 0; i <array.length; i++)
    	  System.out.print(array[i]+"  ");
		
	}

}
