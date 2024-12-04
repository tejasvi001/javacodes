package strings;

import java.util.Scanner;

public class EmailValidations {

	public EmailValidations() {
		// TODO Auto-generated constructor stub
		Scanner sc= new Scanner(System.in);
		int f=0;
		do {
			System.out.println("Enter your Email");
			String _email=sc.nextLine();
			_email.trim();
			int a=_email.indexOf("@");
			if(a>0) {
				String _s1=_email.substring(a);
				int b=_s1.indexOf(".");
				if(b>0) {
					System.out.println("Your email is valid\n You can proceed ");
					f=1;
				}
				else {
					System.out.println("Please Enter a valid email");
				}
			}
			else {
				System.out.println("Please Enter a valid email");
			}
		}while(f==0);
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		EmailValidations obj=new EmailValidations();
	}

}
