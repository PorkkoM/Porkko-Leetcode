package in.sample.porkko.datastrucure;

public class BinaryTree {
	Node1 root;
	public void addNode(int key,String value){
		Node1 newNode = new Node1(key, value);
		if(root == null){
			root = newNode;
		}else{
			Node1 focusNode = root;
			Node1 parent;
			while(true){
				parent = focusNode;
				if(key<focusNode.key){
					focusNode = focusNode.left;
					if(focusNode==null){
						parent.left = newNode;
						return;
					}
				}else{
					focusNode = focusNode.right;
					if(focusNode==null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node1 focusNode) {
		if (focusNode != null) {
			// Traverse the left node
			inOrderTraverseTree(focusNode.left);
			// Visit the currently focused on node
			System.out.println(focusNode);
			// Traverse the right node
			inOrderTraverseTree(focusNode.right);
		}
	}

	public void preorderTraverseTree(Node1 focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.left);
			preorderTraverseTree(focusNode.right);
		}
	}

	public void postOrderTraverseTree(Node1 focusNode) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.left);
			postOrderTraverseTree(focusNode.right);
			System.out.println(focusNode);
		}
	}
	
	public Node1 findNode(int key) {
		// Start at the top of the tree
		Node1 focusNode = root;
		// While we haven't found the Node
		// keep looking
		while (focusNode.key != key) {
			// If we should search to the left
			if (key < focusNode.key) {
				// Shift the focus Node to the left child
				focusNode = focusNode.left;

			} else {
				// Shift the focus Node to the right child
				focusNode = focusNode.right;
			}
			// The node wasn't found
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	
	public static void main(String[] args) {
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");
		theTree.addNode(85, "Salesman 1");
		// Different ways to traverse binary trees
		 theTree.inOrderTraverseTree(theTree.root);
		 theTree.preorderTraverseTree(theTree.root);
		 theTree.postOrderTraverseTree(theTree.root);
	}
}
class Node1{
	
    int key;
	String value;
	Node1 left;
	Node1 right;
	
	public Node1(int key , String value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString(){
		return this.key+"  "+this.value;
	}
	
	
}