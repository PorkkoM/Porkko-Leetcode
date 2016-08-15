package in.porkko.pattern.search;

public class NaiveSearch {
	
	private final int base;
	private int[] occurence;
	private String pattern;
	
	public NaiveSearch(String pattern) {
		this.base=256;
		this.pattern=pattern;
		occurence = new int[base];
				for(int c=0;c<base;c++){
					occurence[c]=-1;
				}
				for(int j=0;j<pattern.length();j++){
					occurence[pattern.charAt(j)]=j;
				}
	}
	
	public static void main(String[] args) {
		
		String str = "AABAACAADAABAAABAA";
		String pat="DAAB";
		
		NaiveSearch ns = new NaiveSearch(pat);
		int first=ns.search(str);
		System.out.println(first);
		
	}
	
	public int search(String txt){
		int n=txt.length();
		int m=pattern.length();
		int skip;
		
		for(int i=0;i<=n-m;i+=skip){
			skip=0;
			for(int j=m-1;j>=0;j--){
				if(pattern.charAt(j)!=txt.charAt(i+j)){
					skip=Math.max(1, j-occurence[txt.charAt(i+j)]);
					break;
				}
				
			}
			if(skip==0){
				return i;
			}
			
		}
		return n;
	}

}
