package in.sample.porkko.datastrucure;

public class LinkListImpl {
	
	Node head;
	Node tail;
	int size;

	 public void add(int data)
	    {
	        Node np = new Node(data);
	        //np.setVal(data);
			if(head == null){
				head = np;
				tail = np;
			}else{
				tail.setNd(np);
				tail = np;
			}
	    }
	
	 
	 public int size(){
		 size =0;
			Node curr = head;
			while(curr!=null){
				size++;
				curr= curr.getNd();
			}
			return size;
	 }
	 
	 public void traversal(){
		 
		 Node curr = head;
		 while(curr!=null){
			 System.out.println(""+curr.getVal());
			 curr=curr.getNd();
		 }
		 
	 }
	 
	 public void reverseLinkedList(){
		 
		 Node prev = null;
		 Node curr = head;
		 Node nxt;
		 
		 while(curr!=null){
			 nxt =curr.nd;
			 curr.nd=prev ;
			 prev =curr;
			 curr =nxt;
			 
		 }
		 head =prev;
	 }
	 
	 public void removeDuplicate(){
		 Node curr = head;
		 while(curr!=null){
			 Node nxt = curr.nd;
			 while(nxt!=null && (curr.val == nxt.val)){
				 nxt = nxt.nd;
			 }
			 curr.nd = nxt;
			 curr = nxt;
		 }
		 
	 }
	 
	// public Node
}
