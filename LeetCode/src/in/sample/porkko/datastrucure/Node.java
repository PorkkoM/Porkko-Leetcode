package in.sample.porkko.datastrucure;

public class Node {
	
	int val;
	Node nd;
	
	public Node(int dftVal ) {
		val = dftVal;
		nd= null;
		// TODO Auto-generated constructor stub
	}
	
	Node(int dftVal ,Node node){
		val=dftVal;
		nd = node;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNd() {
		return nd;
	}

	public void setNd(Node nd) {
		this.nd = nd;
	}

	
	
}
