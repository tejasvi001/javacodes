package backtracking;

public class Main {
	public static void main(String[] args)
	{
		SudokuSolver obj=new SudokuSolver();
		System.out.println("Enter Your Sudoku");
        obj.input();
		if (obj.solveSudoku(obj.grid,0, 0))
			obj.print();
		else
			System.out.println("No Solution exists");
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