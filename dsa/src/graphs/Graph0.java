package graphs;

public class Graph0 {

	private int[][] adjacencymatrix;

	public Graph0(int nodes) {
		this.adjacencymatrix=new int[nodes][nodes];
		for(int i=0;i<adjacencymatrix.length;i++) {
			for(int j=0;j<adjacencymatrix.length;j++) {
				adjacencymatrix[i][j]=0;
			}
		}
	}
	public void addEdge(int source,int destination) {
		this.adjacencymatrix[source][destination]=1;
		this.adjacencymatrix[destination][source]=1;
	}
	void display() {
		for(int i=0;i<adjacencymatrix.length;i++) {
			for(int j=0;j<adjacencymatrix.length;j++) {
				System.out.print(adjacencymatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int nodes=6;
		Graph0 obj=new Graph0(nodes);
		obj.addEdge(0,1);
		obj.addEdge(1, 3);
		obj.addEdge(2,1);
		obj.addEdge(3, 4);
		obj.addEdge(4, 2);
		obj.addEdge(3, 5);
		obj.display();
	}
}
