package in.porkko.design.pattern;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Adder X= new Adder();
		System.out.println("My superclass is: "+X.getClass());
		System.out.println("My superclass is: "+X.getClass().getSuperclass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
        Class cls = Solution.class;	 
        Method[] meth  = cls.getDeclaredMethods();
        Method md = null;
        for(Method ms:meth){
        	System.out.println(ms.getName());
        	if (ms.getName().equals("main")){
        		md = ms;
        	}
        }
        String[]tst ={"qw","ad"};
        System.out.println(Arrays.toString(tst));
        md.setAccessible(true);
        System.out.println(md.hashCode());
       // System.out.println(md.invoke(tst));
        System.out.println(meth.getClass().isSynthetic());
	} 
	
	
}
class Adder extends Solution{
	
	public int add(int a,int b){
		return a+b;
	}
	
}