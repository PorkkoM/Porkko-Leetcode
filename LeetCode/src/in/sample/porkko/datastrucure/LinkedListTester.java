package in.sample.porkko.datastrucure;

public class LinkedListTester {
	
	public static void main(String[] args) {
		
	   LinkListImpl ll = new LinkListImpl();
	   ll.add(1);
	   ll.add(2);
	   ll.add(3);
	   ll.add(4);
	   ll.add(5);
	   System.out.println(""+ll.size());
	   System.out.println("**********************************");
	   ll.traversal();
	   System.out.println("**********************************");
	   ll.add(6);
	 //  ll.traversal();
	   ll.reverseLinkedList();
	   
	   System.out.println("**********************************");
	   ll.traversal();
	}

}
