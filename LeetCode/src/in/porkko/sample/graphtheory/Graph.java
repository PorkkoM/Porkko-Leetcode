package in.porkko.sample.graphtheory;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
	private int V;
	private LinkedList<Integer> adj[];

	public Graph(int v) {
		V=v;
		adj = new LinkedList[v];
	    for(int i=0;i<v;i++){
	    	adj[i]=new LinkedList<Integer>();
	    }
	}
	void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	void DFSUtil(int v,boolean visited[]){
		visited[v] = true;
		System.out.println(v+" ");
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
	void DFS(){
		boolean visited[] = new boolean[V];
		for(int i=0;i<V;i++){
			if(visited[i]==false){
				DFSUtil(i, visited);
			}
		}
	}
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		System.out.println("Following is the Depth First Traversal");
		graph.DFS();
	}
}
