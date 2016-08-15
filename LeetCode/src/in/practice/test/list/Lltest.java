package in.practice.test.list;

public class Lltest {
	
	public static void main(String[] args) {
		
		LinkedListNthElement ll = new LinkedListNthElement();
		ll.addElement(1);
		ll.addElement(2);
		ll.addElement(3);
		ll.addElement(4);
		ll.addElement(5);
	    ll.addElement(6);
	    ll.addElement(7);
		System.out.println("Middle of the LinkedList --->"+ll.getMiddle().n);
		System.out.println("At Position 0 of the LinkedList---->"+ll.getNthNode(4));
		
		
	}

}
