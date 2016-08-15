package in.sample.porkko.test;

public class TwoNoOddOccurence {

	public static void main(String[] args) {
		
		int[] n = {1,1,2,3,6,5,5,6};
		int xor2=n[0];
		int set_bit;
		int i;
		int ni=n.length-2;
		int x=0,y=0;
		for(i=1;i<n.length;i++)
			xor2=xor2^n[i];
		
		set_bit = xor2 & ~(xor2-1);
		System.out.println("set_bit --------->"+set_bit);
		for(i=0;i<n.length;i++){
			if(n[i]==set_bit){
				x=x^n[i];
			}else{
				y=y^n[i];
			}
		}
		System.out.println("=====>"+x+"======"+y);
	}
	
}
