package in.sample.mca;

public class Hello1 {
	
	int x;
	public Hello1(int x) {
		this.x=x;
	}

	public Object clone(){
		Hello1 h = new Hello1(this.x);
		return h;
	}
	
	public String toString(){
		return ""+x;
	}
	
}
