package in.sample.porkko.example;

public class ThreadTest {

	public static void main(String[] args) {

		long id  = Thread.currentThread().getId();
		String threadName = Thread.currentThread().getName();
		System.out.println("---->"+id+"----------String Name-->"+threadName);
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
