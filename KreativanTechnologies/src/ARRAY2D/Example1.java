package ARRAY2D;

import java.util.Scanner;

public class Example1 {
    private int rows;
    private int cols;
    private int[][] matrix;
    static Scanner input;
    static {
    	input=new Scanner(System.in);
    	System.out.println("2D ARRAY EXAMPLE");
    }
    public Example1() {
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
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
	}
}
