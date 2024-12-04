/** the code of 
 * switch case
 */
package codes;

import java.util.Scanner;

public class CareerOptions {

	public CareerOptions() {
		System.out.println(" Career Options Application");
		Scanner sc=new Scanner(System.in);//for taking input
		System.out.println("1. Sportsman");
		System.out.println("2. Businessman");
		System.out.println("3. Doctor");
		System.out.println("4. Engineer");
		System.out.println("5. Scientist");
		System.out.print("Please Enter your preffered Career Option: ");
		int career=sc.nextInt();
		switch(career)
		{	
			case 1:
				System.out.println(" You are a Sportsman");
				break;
			case 2:
				System.out.println(" You are a Businessman");
				break;
			case 3:
				System.out.println(" You are a Doctor");
				break;
			case 4:
				System.out.println(" You are a Engineer");
				break;
			case 5:
				System.out.println(" You are a Scientist");
				break;
			default:
				System.out.println("YOU CAN ALSO EXPLORE MORE OPTIONS");
			
		}
	}

	public static void main(String[] args) {
		CareerOptions obj=new CareerOptions();

	}

}
