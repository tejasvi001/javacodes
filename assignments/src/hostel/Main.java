package hostel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HostelAllotment obj=new HostelAllotment();
		Scanner input=new Scanner(System.in);
		int choice;
		do {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1. ALLOT A ROOM");
			System.out.println("2. PRINT ROOM DETAILS");
			System.out.println("3. EXIT");
			System.out.println("------------------");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				obj.roomAllotment();
				break;
			case 2:
				obj.printRoomDetails();
				break;
			case 3:
				System.out.println("EXITING...");
				break;
			default:
				System.out.println("PLEASE ENTER CORRECT CHOICE");
			}
			
		}while(choice !=3);
	}
}
