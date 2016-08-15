package in.practice.test.list;

public class LinkedListNthElement {
	
	Node head;
	
	public int getNthNode(int n){
		int ret=0;
		Node currnt = head;
		while(currnt!=null){
			if(ret == n){
				return currnt.n;
			}
			currnt = currnt.next;
			ret++;
		}
		assert(false);
		return -1;
	}
	
	public void addElement(int n){
		Node new_node = new Node(n);
		new_node.next = head;
		head = new_node;
	}
	
	public Node getMiddle(){
		Node currnt = head;
		Node middle = head;
		int l =0;
		while(currnt.next!=null){
			
			if(l%2==0){
				middle = middle.next;
			}
			l++;
			currnt = currnt.next;
		}
		if(l%2==1){
			middle = middle.next;
		}
		return middle;
	}
	
	
}
