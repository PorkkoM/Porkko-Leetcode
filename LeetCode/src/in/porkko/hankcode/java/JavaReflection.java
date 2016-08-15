package in.porkko.hankcode.java;

import in.porkko.design.pattern.Singleton;

public class JavaReflection {
	
	public static void main(String[] args) {
//		try {
            
//            Method m[] = student.getDeclaredMethods();
//            for (int i = 0; i < m.length; i++)
//                System.out.println(m[i].toString());
//            System.out.println(""+student.getSuperclass());
//            ArrayList<String> methodList = new ArrayList<String>();
//   		 for(Method meth:m){
//                methodList.add(meth.getName());
//            }
//        } catch (Throwable e) {
//            System.err.println(e);
//        }
		Class student = Singleton.class;
        System.out.println(""+student.getModifiers());
		
	}

}
