package in.sample.porkko.code.fight;

public class TillSIngle {
	
	public static void main(String[] args) {
		
		String n="98";
		//String n = "2^34";
		long ns=0;
		int nt = n.indexOf("^");
		//System.out.println(Math.abs(-03003));
		if(nt>0){
				int n1=Integer.parseInt(n.substring(0,nt));
				int n2=Integer.parseInt(n.substring(nt+1,n.length()));
				long ns5= (long)Math.pow(n1, n2);
				ns= Long.valueOf(ns5);
				//System.out.println(ns);
			}else{
				ns= Long.valueOf(n);
			}
		if(ns<=9){
			System.out.println(n);
		}else{
			long nd=(1+(ns-1)%9);
			System.out.println(nd);
		}
	}

}
