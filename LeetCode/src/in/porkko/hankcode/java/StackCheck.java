package in.porkko.hankcode.java;

import java.util.Stack;
public class StackCheck {
	public static void main(String[] args) {
		String chk = "({()})";
		Stack<String> stck = new Stack<String>();
		for(int j=chk.length()-1;j<=0;j--){
			String input = String.valueOf(chk.charAt(j));
			if(input.equals(")")||input.equals("}")||input.equals("]")){
				stck.push(input);
			}else{
				if(input.equals("(")){
					if(stck.peek().equals(")")){
						stck.pop();
					}
				}else if(input.equals("{")){
					if(stck.peek().equals("}")){
						stck.pop();
					}
					   
					
				}else if(input.equals("[")){
					if(stck.peek().equals("]")){
						stck.pop();
					}
				}
			}
			if(stck.isEmpty()){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
	}
}
