package hostel;

import java.util.Arrays;
import java.util.Scanner;

public class HostelAllotment {
	private int rooms[];
	private static Scanner input;
	private int N;
	private int bedOccupied=0;
	int currentRoom=0;
	
	static {
		input=new Scanner(System.in);
	}
	
	public HostelAllotment() {
		System.out.println("Enter Total Number of Rooms in the Hostel");
		rooms=new int[input.nextInt()];
		Arrays.fill(rooms,0);
		System.out.println("Enter No. of Students In One Room");
		N=input.nextInt();
	}
	public void roomAllotment() {
		if(bedOccupied<N&&currentRoom<rooms.length) {
			rooms [currentRoom]++;
			bedOccupied++;
			System.out.println("Bed Alloted");
			System.out.println("Room No: "+(currentRoom+1)+" Bed Number: "+bedOccupied);
		}
		else if(currentRoom>=rooms.length) {
			System.out.println(" Rooms are full kindly try again later \n\n");
		}
		else {
			currentRoom++;
			bedOccupied=0;
			roomAllotment();
		}
	}
	public void printRoomDetails() {
		for(int i=0;i<N;i++) {
			System.out.println(" Room No: "+(i+1)+" Beds Allocated: "+rooms[i]);
		}
	}

}
