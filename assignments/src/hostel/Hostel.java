package hostel;

import java.util.Arrays;
import java.util.Scanner;

public class Hostel {
	private static Scanner input;
	private int rooms[]=new int[10];
	private int roomCapacity=4;
	private int roomCounter=0;
	private int bedAlloted=0;
	static {
		input=new Scanner(System.in); 
		
	}
	public Hostel() {
		Arrays.fill(rooms, 0);
	}
	public void roomAllotment() {
		if(bedAlloted<roomCapacity&&roomCounter<10) {
			rooms[roomCounter]++;
			bedAlloted++;
			System.out.println("Bed Allotted");
		}else {
			roomCounter++;
			bedAlloted=0;
			roomAllotment();
		}
	}
	public static void main(String[] args) {
	
		Hostel obj=new Hostel();
		int choice;
		do {
			System.out.println("1. Room Allotment");
			System.out.println("2. Exit");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				obj.roomAllotment();
				break;
			case 2:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter Correct Choice");
			}
		}while(choice !=2);
	}

}
