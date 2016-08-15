package in.porkko.design.pattern;

public class Singleton {
	private Singleton(){
		
	}
	public static final Singleton inst  = new Singleton();
	public static Singleton getInstance()
	{
		if(inst==null){
			return inst;
		}
		return inst;
	}
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
