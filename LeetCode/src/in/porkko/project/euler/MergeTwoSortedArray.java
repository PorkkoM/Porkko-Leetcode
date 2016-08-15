package in.porkko.project.euler;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		
		int[] a ={1,2,3,4,5,6,7,8,9,9,10,10,11};
		int[] b={2,3,3,4,5,6,7};
		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		 while (i < a.length && j < b.length)
		    {
		        if (a[i] < b[j])       
		            answer[k++] = a[i++];

		        else        
		            answer[k++] = b[j++];               
		    }
		 System.out.println("k---"+k);
		 System.out.println("1---"+i);
		 System.out.println("1---"+a.length);
		 while (i < a.length)  {
		        answer[k++] = a[i++];
		        System.out.println("k===="+k);
		        }
	     while (j < b.length)    {
		        answer[k++] = b[j++];
		        System.out.println("k===4="+k);       
	     }
	     for(int g:answer){
		    	System.out.print(g+" ");
		    }
		
		
	}

}
