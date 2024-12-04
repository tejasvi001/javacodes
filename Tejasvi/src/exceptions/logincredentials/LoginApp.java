package exceptions.logincredentials;`

import java.util.Scanner;

public class LoginApp {
	private String client;
	private String userId;
	private String userPassword;
	public LoginApp(String client) {
		// TODO Auto-generated constructor stub
		this.client=client;
	}
	static {
		Scanner sc=new Scanner(System.in);
	}
	{
		System.out.println("LoginApp");
	}
	
	public boolean verifyLoginCredentials(String userId,String userPassword) {
		try {
			if(userId.equals("tim")&&userPassword.equals("123")) {
				return true;
			}
			throw new CredentialVerificationException("Credentials not verified");
		}
		catch(CredentialVerificationException obj) {
			System.out.println(obj.getMessage());
		}
	}
	public static void main(String args[]) {
		LoginApp obj=new LoginApp("HDFC");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String userId=sc.nextLine();
		System.out.println("Enter your name");
		String userPassword=sc.nextLine();
		if(obj.verifyLoginCredentials(userId, userPassword)) {
			System.out.println("Verified");
		}
	}
}
