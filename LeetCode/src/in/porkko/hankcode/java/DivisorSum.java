

package in.porkko.hankcode.java;

public class DivisorSum {
	
	public static void main(String[] args) {
		
		int res = 0;
		int n=6;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				res += i;
			}
		}
		System.out.println(res);
		System.out.println("wAtp5b6UnfJJUtQzGwKDZHP3_3wX4Z6XGhhDQnqZPdezHn0EVvWUTbILy7yLctj8F27HInSvJHdkCMQw".length());
		DivisorSum as = new  DivisorSum();
		System.out.println(as.powerof2(15));
		}
	

	private String powerof2(int num)
	{
		return ((num&num-1)==0)?"power of 2":"not a power of 2";
	}

}
