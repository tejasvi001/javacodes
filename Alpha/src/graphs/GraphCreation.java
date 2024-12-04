package graphs;
import java.util.*;
public class GraphCreation {
	 int V=5;
	public static class Edge{
		int src;
		int dest;
		int wt;
		public Edge(int src,int dest,int wt) {
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	 ArrayList<Edge>[] graph;
	
	public GraphCreation() {
		// TODO Auto-generated constructor stub
		graph=new ArrayList[V];
		for(int i=0;i<V;i++) {
			graph[i]=new ArrayList<>();
		}
	}
	public void addEdge(int src,int dest,int wt) {
		graph[src].add(new Edge(src,dest,wt));
	}
	public void display() {
		for(int i=0;i<V;i++) {
			System.out.print(i+"->");
			for(int j=0;j<graph[i].size();j++) {
				Edge e=graph[i].get(j);
				System.out.print(e.dest+" ");
			}
			System.out.println();
		}
	}
	public void bfs(int src) {
		System.out.print(src+"-> ");
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(src);
		boolean[] visited=new boolean[V];
		while(!queue.isEmpty())
		{
			src=queue.poll();
			if(!visited[src]) {
				visited[src]=true;
				System.out.print(src+" ");
				for(int i=0;i<graph[src].size();i++) {
					Edge e=graph[src].get(i);
					queue.add(e.dest);
				}
			}
		}
		System.out.println();
	}
	void Dfs() {
		boolean visited[]=new boolean[V];
		for(int i=0;i<graph.length;i++) {
			if(visited[i]==false) {
				dfs(i,visited);
			}
		}
	}
	void dfs(int curr,boolean visited[]) {
		System.out.print(curr+" ");
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {

			Edge e=graph[curr].get(i);
			if(!visited[e.dest]) {
				dfs(e.dest,visited);
			}
		}
	}
	public boolean hasPath(int src,int dest,boolean[] visited) {
		if(src==dest) {
			return true;
		}
		visited[src]=true;
		for(int i=0;i<graph[src].size();i++) {
			Edge e=graph[src].get(i);
			if(!visited[e.dest]&&hasPath(e.dest, dest, visited)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphCreation obj=new GraphCreation();
		obj.addEdge(0, 1, 5);
		obj.addEdge(1, 0, 5);
		obj.addEdge(1, 2, 1);
		obj.addEdge(1, 3, 3);
		obj.addEdge(2, 1, 1);
		obj.addEdge(2, 4, 2);
		obj.addEdge(2, 3, 1);
		obj.addEdge(3, 1, 3);
		obj.addEdge(3, 2, 1);
		obj.addEdge(4, 2, 2);
		obj.display();
		System.out.println("BFS");
		obj.bfs(0);
		obj.bfs(1);
		obj.bfs(2);
		obj.bfs(3);
		obj.bfs(4);
		System.out.println("DFS");
		obj.dfs( 0,new boolean[5]);
		boolean hasPath=obj.hasPath(0, 4, new boolean[5]);
		System.out.println(hasPath);
	}
}