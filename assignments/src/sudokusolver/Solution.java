package sudokusolver;

import java.util.Scanner;

public class Solution {
	private char[][] board;
	Scanner input;
	public Solution() {
		// TODO Auto-generated constructor stub
		input=new Scanner(System.in);
	}
	public void solveSudoku() {
        // Start solving sudoku from the first cell
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        // Base case: If row is equal to board length, entire board has been filled
        if (row == board.length) {
            return true;
        }
        
        // Move to next row when current row is fully filled
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        
        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        
        // Try different numbers in current cell
        for (char num = '1'; num <= '9'; num++) {
            if (isValidPlacement(board, row, col, num)) {
                board[row][col] = num; // Fill current cell with valid number
                
                // Move to next cell
                if (solve(board, row, col + 1)) {
                    return true;
                }
                
                // Backtrack to previous state if solution not found
                board[row][col] = '.';
            }
        }
        
        // No valid solution found
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        // Check if num is already in the same row, column or 3x3 subgrid
        for (int i = 0; i < board.length; i++) {
            // Check row
            if (board[i][col] == num) {
                return false;
            }

            // Check column
            if (board[row][i] == num) {
                return false;
            }
 
            // Check 3x3 subgrid
            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid
 
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }

        // Placement is valid
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        int n = board.length;
        
        for(int i = 0; i < n; i++){
            if(!checkIfValid(i, 0, i, n - 1)) return false;
            if(!checkIfValid(0, i, n - 1, i)) return false;
        }
        
        for(int startRow = 0; startRow < n; startRow += 3){
            for(int startCol = 0; startCol < n; startCol += 3){
                if(!checkIfValid(startRow, startCol, startRow + 2, startCol + 2)) return false;
            }   
        }
        
        return true;
    }
    
    private boolean checkIfValid(int startRow, int startCol, int endRow, int endCol){
        int[] check = new int[9];
        for(int i = startRow; i <= endRow; i++){
            for(int j = startCol; j <= endCol; j++){
                char c = board[i][j];
                if(c != '0'){
                    if(check[c - '1'] >= 1) return false;
                    check[c - '1']++;
                }
            }
        }
        return true;
    }
   public void input() {
    	System.out.println("Enter the size");
    	int n=input.nextInt();
    	char[][] board=new char[n][n];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			board[i][j]=input.next().charAt(0);
    		}
    	}
    	if(!isValidSudoku(board)) {
    		System.out.println("The sudoku is incorrect please enter again");
    		input();
    	}
    		
    }
   public void display() {
	   int n=board.length;
	   for(int i=0;i<n;i++) {
   		for(int j=0;j<n;j++) {
   			System.out.print(board[i][j]+" ");
   		}
   		System.out.println();
   	}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution obj=new Solution();
		obj.input();
		obj.solveSudoku();
		obj.display();
	}
}
/*
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0 
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0
*/
