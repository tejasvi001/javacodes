package ARRAY2D;

import java.util.Scanner;

public class SearchIn2dMatrix {
	 private int rows;
	    private int cols;
	    private int[][] matrix;
	    static Scanner input;
	    static {
	    	input=new Scanner(System.in);
	    	System.out.println("2D ARRAY EXAMPLE");
	    }
	public SearchIn2dMatrix() {
		System.out.println("Enter rows");
    	rows=input.nextInt();
    	System.out.println("Enter cols");
    	cols=input.nextInt();
    	input();
    	output();
	}
	public void input() {
    	System.out.println("Enter the values for the array");
    	matrix=new int[rows][cols];
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			matrix[i][j]=input.nextInt();
    		}
    	}
    }
    public void output() {
    	System.out.println("The values for the matrix are as follows");
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<cols;j++) {
    			System.out.print( matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    public boolean search() {
    	System.out.println("Enter value to search");
    	int searchValue=input.nextInt();
    	for(int i=0;i<rows;i++) 
    		for(int j=0;j<cols;j++)
    			if(matrix[i][j]==searchValue)
    				 return true;
    	return false;
    }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchIn2dMatrix obj=new SearchIn2dMatrix();
		if(obj.search())
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}
