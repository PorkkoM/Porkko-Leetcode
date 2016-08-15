package in.sample.porkko.leetjudge;

public class RemoveAndCountArray {
	
	public static void main(String[] args) {
		int a[] ={1,2,2,3,3,3};
		if(a.length==0){
			throw new IllegalArgumentException("Zero Size Array");
		}
		int count =0;
		int p1=0,p2=0;	
		p1=p2=a[0];
		for(int j=1;j<a.length;j++){
			if(p1==a[j] && p2==a[j]){
				continue;
			}else{
				p2=a[j];
				p1=a[j];
				count++;
			}
		}
		System.out.println(""+count);
	}
}
