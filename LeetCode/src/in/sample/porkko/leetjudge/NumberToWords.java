package in.sample.porkko.leetjudge;

import java.util.Stack;

public class NumberToWords {
	
	public static void main(String[] args) {
		int n = 12345;
		String numsstr[] ={"One","Two","Three","Four","Five","Six","Seven","Eight","nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen"
				           ,"Sixteen","Seventeen","Eighteen","Nineteen"};
		String tyStr[] ={"Ten","Twenty","Thirty","Fourty","Fivty","Sixty","Seventy","Eighty","Ninty"};
 		String mjStr[] ={"Hundred","Thousand","Million","Billion"};
		StringBuffer sf  = new StringBuffer();
		String tmp = String.valueOf(n);
		int len = tmp.length();
		System.out.println(len);
		Stack<Integer> myStack = new Stack<Integer>();
		do{
			if(len>3){
				String dumStr = tmp.substring(len-3,len);
				myStack.push(Integer.parseInt(dumStr));
				len =len-3;
				tmp = tmp.substring(0, tmp.length()-3);
			}else{
				myStack.push(Integer.parseInt(tmp));
				len=0;
				break;
			}
		}while(len>=0);
		for(int i=0;i<=myStack.size();i++){
			String getElem = String.valueOf(myStack.peek());
				if(Integer.parseInt(getElem)==0){
					break;
				}else{
					if(getElem.length()==3){
					int s = Integer.parseInt(String.valueOf(getElem.charAt(0)));
					if(s!=0)
						sf.append(numsstr[s-1]);
					sf.append(" ");
					sf.append(mjStr[0]);
					sf.append(" ");
					int s1 = Integer.parseInt(String.valueOf(getElem.charAt(1)));
						if(s1!=0)
							sf.append(tyStr[s1-1]);
					sf.append(" ");
					
					int s2 = Integer.parseInt(String.valueOf(getElem.charAt(2)));
					if(s2!=0){
						sf.append(numsstr[s2-1]);
						}
					sf.append(" ");
					}else if(getElem.length()==2){
						int s1 = Integer.parseInt(String.valueOf(getElem.charAt(0)));
						if(s1!=0 && s1==1){
							sf.append(numsstr[Integer.parseInt(getElem)-1]);
							sf.append(" ");
							sf.append(mjStr[myStack.size()-1]);
							sf.append(" ");
							getElem="";
						}
						int s0 = Integer.parseInt(String.valueOf(getElem.charAt(0)));
						if(s0!=0 && s0!=1){
							sf.append(tyStr[s0-1]);
							sf.append(" ");
						}
						int s2 = Integer.parseInt(String.valueOf(getElem.charAt(1)));
						if(s2!=0 && s2!=1){
							sf.append(numsstr[s2-1]);
							sf.append(" ");
							}
					
					}else if(getElem.length()==1){
						int s2 = Integer.parseInt(String.valueOf(getElem.charAt(0)));
						if(s2!=0){
							sf.append(numsstr[s2-1]);
							//sf.append(" ");
							//sf.append(mjStr[myStack.size()-1]);
							}
						sf.append(" ");
					}
					sf.append(" ");
					//sf.append(mjStr[myStack.size()-1]);
					myStack.pop();
					System.out.println("---->"+sf.toString());
			}
		}
		
		
	}
	

}
