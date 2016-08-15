package in.sample.porkko.datastrucure;

public class PairwiseLinkedList {
	

	
	static Node head;
	Node tail;
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
	
	public Node pairwiseSwap(Node node){
		 // If linked list is empty or there is only one node in list
        if (node == null || node.next == null) {
            return null;
        }
 
        // Initialize previous and current pointers
        Node prev = node;
        Node curr = node.next;
 
        node = curr;  // Change head before proceeeding
 
        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node
 
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
 
            // Change next of previous to next next
            prev.next = next.next;
 
            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return node;
		//return null;
	}
	 void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	 
	 public void add(int data)
	    {
		 /* 1. alloc the Node and put data*/
	        Node new_Node = new Node(data);
	 
	        /* 2. Make next of new Node as head */
	        new_Node.next = head;
	 
	        /* 3. Move the head to point to new Node */
	        head = new_Node;
	    }
	    // Driver program to test above functions
	    public static void main(String[] args) {
	 
	        /* The constructed linked list is:
	         1->2->3->4->5->6->7 */
	    	PairwiseLinkedList list = new PairwiseLinkedList();
	    	list.add(1);
	    	list.add(2);
	    	list.add(3);
	    	list.add(4);
	    	list.add(5);
	    	list.add(6);
	    	list.add(7);
//	        list.head = new Node(1);
//	        list.head.next = new Node(2);
//	        list.head.next.next = new Node(3);
//	        list.head.next.next.next = new Node(4);
//	        list.head.next.next.next.next = new Node(5);
//	        list.head.next.next.next.next.next = new Node(6);
//	        list.head.next.next.next.next.next.next = new Node(7);
	 
	        System.out.println("Linked list before calling pairwiseSwap() ");
	        list.printList(head);
	        Node st = list.pairwiseSwap(head);
	        System.out.println("");
	        System.out.println("Linked list after calling pairwiseSwap() ");
	        list.printList(st);
	        System.out.println("");
	 
	    }
}
