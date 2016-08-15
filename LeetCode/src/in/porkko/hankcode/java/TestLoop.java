package in.porkko.hankcode.java;

public class TestLoop {
	public void process(int a){
		Loop:for(int i=0;i<3;i++){
			for(int j=0;i<3;j++){
				if(a==5){
					break;
					//goto Loop;
				}
				System.out.println(""+i*j);
			}
		}
		
	}
	public static void main(String[] args) {
		TestLoop ts = new TestLoop();
		ts.process(5);
		boolean str = true;
		if(str = true ){
			System.out.println("Helo");
		}else{
			System.out.println("Heoo");
		}
		
	}
}
