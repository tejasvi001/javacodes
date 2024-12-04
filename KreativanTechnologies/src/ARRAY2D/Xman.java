package ARRAY2D;

public class Xman {
	public Xman() {
		// TODO Auto-generated constructor stub
		char arr[][]=new char[5][5];
		int i,j;
		//Filling each entry of the array with zero or O
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				arr[i][j]='O';
			}
		}
		/*
		 * for(i=0;i<5;i++) {
			arr[i][i]='X';	
			}
		 */
		//Setting  diagonals of matrix to X
		for(i=0;i<5;i++) {
			arr[i][i]='X';	
			for(j=0;j<5;j++) {
				if(i+j==4) {
				arr[i][j]='X';
				}
			}	
		}
		//Printing the array
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Xman obj=new Xman();
	}
}
