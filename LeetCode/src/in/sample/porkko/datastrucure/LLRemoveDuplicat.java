package in.sample.porkko.datastrucure;

public class LLRemoveDuplicat {

	public static void main(String[] args) {

      LinkListImpl ll = new LinkListImpl();
      ll.add(1);
      ll.add(1);
      ll.add(5);
      ll.add(2);
      ll.add(6);
      ll.add(3);
      ll.add(14);
      ll.traversal();
      System.out.println("After Removing duplicates***************");
      ll.removeDuplicate();
       ll.traversal();
       ll.reverseLinkedList();
       System.out.println("After Reverse**************");
       ll.traversal();
	}

}
