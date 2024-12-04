package intro;

import java.util.Scanner;

public class Hostel {
	private static Scanner input;
	//private final static ROOM =1;
	//private final static STUDENTS=4;
	private int N;
	private boolean isBedAvailable;

	private int addStudent=0;
	static {
		input=new Scanner(System.in);
	}
	public Hostel(int N) {
		N=input.nextInt();
		this.N=N;
	}
	public boolean isBedAvailable() {
		isBedAvailable=true;
		return isBedAvailable;
	}
	public int addStudent() {
		if(addStudent<=N) {
		return ++addStudent;
		}
		else {
			return 0;
		}
	}
	public int checkAnotherRoom() {
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
		Hostel obj=new Hostel(N);
		int i=0;
		do {
			i++;
		if(obj.isBedAvailable()) {
			
			System.out.println("Bed occupied:  "+obj.addStudent()  );
		}
		else {
			obj.checkAnotherRoom();
		}
		}while(i<4);
	}

}
