package graphs;

import java.util.LinkedList;
import java.util.*;


public class Traversal {
	private int V;
	private LinkedList<Integer>[] adj;
	public Traversal(int v) {
		// TODO Auto-generated constructor stub
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	//BFS Traversal
	void bfs(int s) {
		boolean[] visited=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<>();
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty()) {
			s=queue.remove();
			System.out.print(s+" ");
			for(Integer neighbour:adj[s]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					queue.add(neighbour);
				}
			}
		}	
		System.out.println();
	}
	//dfs
	void dfs(int s) {
		boolean[] visited=new boolean[V];
		DFSUtil(s,visited);
	}
	void DFSUtil(int s,boolean[] visited) {
		visited[s]=true;
		System.out.print(s+" ");
		for(Integer neighbour:adj[s]) {
			if(!visited[neighbour]) {
				DFSUtil(neighbour,visited);
			}
		}
		
	}
	void dfsiterative(int s) {
		Stack<Integer> obj =new Stack<>();
		obj.push(s);
		boolean[] discovered=new boolean[V];
		while(!obj.isEmpty()) {
			s=obj.pop();
			if(discovered[s]) {
				continue;
			}
			discovered[s]=true;
			System.out.print(s+" ");
			List<Integer> adjList=Traversal.adjList.get(0);
			for(int i=adjList.size();i>=0;i--) {
				
			}
		}
	}
	public static void main(String args[]) {
		Traversal obj=new Traversal(6);
		obj.addEdge(0,1);
		obj.addEdge(1, 3);
		obj.addEdge(0, 2);
		obj.addEdge(2, 4);
		obj.addEdge(3, 5);
		obj.bfs(0);
		obj.dfs(0);
	}
}
