package backtracking;

import java.util.Scanner;

public class Problem00 {
	private static Scanner input;
	private int N;
	private int[][] iMaze;
	static {
		input=new Scanner(System.in);
	}
	public Problem00(int N) {
		System.out.println("imaze");
//		N=input.nextInt();
//		iMaze=new int[N][N];
//		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<N;j++) {
//				iMaze[i][j]=input.nextInt();
//			}
//		}
	}
	public void maze(int curr_row,int curr_col,int end_row,int end_col,String solution) {
		//positive base case
		if(curr_row==end_row&&curr_col==end_col) {
			System.out.println(solution);
			return;
		}
		//negative base case
		if(curr_row>end_row||curr_col>end_col) {
			return;
		}
		maze(curr_row,curr_col+1,end_row,end_col,solution+"H");
		maze(curr_row+1,curr_col,end_row,end_col,solution+"V");
		//diagonal
		//maze(curr_row+1,curr_col+1,end_row,end_col,solution+"D");
	}
	public int gridWays(int startrow,int startcol,int endrow,int endcol) {
		if(startrow==endrow-1&&startcol==endcol-1) {
			return 1;
		}
		if(startrow==endrow||startcol==endcol) {
			return 0;
		}
		int w1=gridWays(startrow+1,startcol,endrow,endcol);
		int w2=gridWays(startrow,startcol+1,endrow,endcol);
		return w1+w2;
	}
	public static void main(String[] args) {
		int N=0;
		Problem00 obj=new Problem00(N);
		obj.maze(0,0,3,3,"");
		System.out.println(obj.gridWays(0, 0, 3, 3));
	}
	
}
