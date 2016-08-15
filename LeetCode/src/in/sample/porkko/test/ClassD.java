package in.sample.porkko.test;

public class ClassD extends ClassC{

	public static void main(String[] args) {
		ClassC obj1 =new ClassD();
		ClassB obj2 =new ClassD();
		ClassA obj3 =new ClassD();
		ClassA k = new ClassC();
//		k.printA();
//		obj1.printA();
//		obj2.printA();
//		obj3.printA();
		ClassD obj4 =new ClassD();
		System.out.println(""+obj4.add(1,2));
		System.out.println(""+obj4.add(1,2,3));
		System.out.println(""+obj4.add(1,2,3,4,5));
		System.out.println(""+obj4.add(1,2,3,4,5,6));
		
	}
	
	public void printA(){
		  System.out.println("Inside D");
	  }
	
	public int add(int ... args){
		
		int size = args.length;
		int result=0;
		if(size == 2){
			result = args[0]+args[1];
			System.out.println(args[0]+"+"+args[1]+"="+result);
		}else if(size == 3){
			result = args[0]+args[1]+args[2];
			System.out.println(args[0]+"+"+args[1]+"+"+args[2]+"="+result);
		}else if(size == 5){
			result = args[0]+args[1]+args[2]+args[3]+args[4];
			System.out.println(args[0]+"+"+args[1]+"+"+args[2]+"+"+args[3]+"+"+args[4]+"="+result);
		}else if(size == 6){
			result = args[0]+args[1]+args[2]+args[3]+args[4]+args[5];
			System.out.println(args[0]+"+"+args[1]+"+"+args[2]+"+"+args[3]+"+"+args[4]+"+"+args[5]+"="+result);
		}
		
		return result;
		
	}
}
