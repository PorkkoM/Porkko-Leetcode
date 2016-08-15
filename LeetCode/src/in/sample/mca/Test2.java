package in.sample.mca;

public class Test2 {
	
	int x=12;
	public static void main(String[] args) {
		//System.out.println(switchIt(4));
		Hello1 h = new Hello1(56);
		//System.out.println(h.clone());
		Test2 t= new Test2();
		t.method(5);
		System.out.println(t.x);
	}
	
	public void method(int x){
		
		x+=x;
		System.out.println(x);
	}
	
	public static int switchIt(int x){
		int j=1;
		switch(x){
		case 1:j++;
		case 2:j++;
		case 3:j++;
		case 4:j++;
		case 5:j++;
		default:j++;
		}
		return j+x;
	}

}
