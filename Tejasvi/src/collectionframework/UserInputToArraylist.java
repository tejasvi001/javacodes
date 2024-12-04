package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputToArraylist {

	public UserInputToArraylist() {
	// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> _arrayList=new ArrayList<>();
		System.out.println("Enter Number of elements you want to enter");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			_arrayList.add(sc.next());
		}
		System.out.println(_arrayList);
	}
	
	

}
