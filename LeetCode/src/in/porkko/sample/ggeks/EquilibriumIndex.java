package in.porkko.sample.ggeks;

public class EquilibriumIndex {
	
	public static void main(String[] args) {
		
		int[] r = {-7,1,5,2,-4,3,0};
		int i,j;
		int rsum,lsum;
		boolean tr=false;
		for(i=0;i<r.length;i++){
			lsum=0;rsum=0;
			for(j=0;j<i;j++)
				lsum+=r[j];
			for(j=i+1;j<r.length;j++)
			     rsum += r[j];
			if(lsum==rsum){
				System.out.println("Equilibrium index---->"+i);
				tr=true;
			}
		}
		if(!tr){
			System.out.println("No index found -1");
		}
	}

}
