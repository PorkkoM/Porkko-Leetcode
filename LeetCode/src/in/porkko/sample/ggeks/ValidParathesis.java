package in.porkko.sample.ggeks;

import java.util.Stack;

public class ValidParathesis {
	
	public static void main(String[] args) {
		ValidParathesis vp = new ValidParathesis();
		boolean test = vp.isValid("[])");
		System.out.println(""+test);
	}

	public boolean isValid(String s){
        Stack<String> myStack = new Stack<String>();
        Stack<String> dummyStack = new Stack<String>();
        boolean chkFlag = false;
        if(s.length()==0){
            return chkFlag;
        }
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='{' ||s.charAt(i)=='[' ||s.charAt(i)=='('){
				myStack.push(Character.toString(s.charAt(i)));
			}
			if(s.charAt(i)=='}'){
				if(myStack.size()!=0 && myStack.peek().equals("{") ){
					myStack.pop();
				}else{
					dummyStack.push(Character.toString(s.charAt(i)));
				}
				
			}else if(s.charAt(i)==']'){
				if(myStack.size()!=0 && myStack.peek().equals("[") ){
					myStack.pop();
				}else{
					dummyStack.push(Character.toString(s.charAt(i)));
				}
				
			}else if(s.charAt(i)==')'){
				if(myStack.size()!=0 && myStack.peek().equals("(") ){
					myStack.pop();
				}else{
					dummyStack.push(Character.toString(s.charAt(i)));
				}
				
			}
			
		}
		
		if(myStack.isEmpty() && dummyStack.isEmpty() ){
			chkFlag = true;
		}
		
		return chkFlag;
        
    }
}
