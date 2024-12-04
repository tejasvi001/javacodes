package stack;

import java.util.Scanner;

public class TowerOfHanoi {

	public TowerOfHanoi() {
		System.out.println("Tower Of Hanoi");
	}
	static int step=1;	
									//source,destination,auxilary
	public void towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod) {
		if(n==1) {
			System.out.println( " Move disk 1 From ROD "+from_rod+" TO " +to_rod);
			return;
		}
		towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println(" Move disk "+n+" From ROD "+from_rod+" TO "+to_rod);
		towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		TowerOfHanoi obj=new TowerOfHanoi();
		int n=input.nextInt();
		//A B C
		obj.towerOfHanoi(n, 'A', 'C', 'B');
	}
}
