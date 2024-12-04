package backtracking;
import java.util.Scanner;
public class Problem01 {
	private static Scanner input;
	private int N;
	private static int[][] iMaze;
	private static boolean[][] bMaze;
	static {
		input=new Scanner(System.in);
	}
	public Problem01(int N) {
		System.out.println("imaze");
		this.N=input.nextInt();
	}
	public void create_iMaze(int N) {
		N=this.N;
		iMaze=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				iMaze[i][j]=input.nextInt();
			}
		}
	}
	public void create_bMaze(int N) {
		N=this.N;
		bMaze=new boolean[N][N];
	}
	public void maze(int iMaze[][],int row,int col,String solution,boolean bMaze[][]) {
		if(row==iMaze.length-1&&col==iMaze[0].length -1) {
			System.out.println(solution);
			return;
		}
		if(row<0||col<0||row>=iMaze.length||col>=iMaze.length||bMaze[row][col]||iMaze[row][col]==1) {
			return;
		}
		bMaze[row][col]=true;
		maze(iMaze,row-1,col,solution+"T",bMaze);
		maze(iMaze,row+1,col,solution+"D",bMaze);
		maze(iMaze,row,col+1,solution+"R",bMaze);
		maze(iMaze,row,col-1,solution+"L",bMaze);
		bMaze[row][col]=false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
		Problem01 obj=new Problem01(N);
		obj.create_iMaze(N);
		obj.create_bMaze(N);
		obj.maze(iMaze, 0, 0, "", bMaze);
	}
}