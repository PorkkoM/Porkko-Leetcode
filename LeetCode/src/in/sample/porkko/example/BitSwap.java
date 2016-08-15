package in.sample.porkko.example;

public class BitSwap {
	public static void main(String[] args) {
		int i =5;
		int evens = (0x55555555&i)<<1;
		int odds = (0x55555555&i)>>1;
		System.out.println(evens);
		System.out.println(odds);
		System.out.println(odds|evens);
	}
}
