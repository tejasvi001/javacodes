package BCAPROJECT;
import java.util.*;
public class MaxCashback {
	int gpay;
	 int phonepe;
	 int paytm;
	public MaxCashback() {
		 System.out.println("Max CashBack appp");
		 Scanner sc=new Scanner(System.in);
		 int x;
		 System.out.println("Enter for gpay");
		 x=sc.nextInt();
		 setGpay(x);
		 System.out.println("Enter for phonepe");
		 x=sc.nextInt();
		 setPhonepe(x);
		 System.out.println("Enter for paytm");
		 x=sc.nextInt();
		 setPaytm(x);
	}
	public int getGpay() {
		return gpay;
	}
	public void setGpay(int gpay) {
		this.gpay = gpay;
	}
	public int getPhonepe() {
		return phonepe;
	}
	public void setPhonepe(int phonepe) {
		this.phonepe = phonepe;
	}
	public int getPaytm() {
		return paytm;
	}
	public void setPaytm(int paytm) {
		this.paytm = paytm;
	}
	
	public void CashBackApp() {
		if(gpay>phonepe&&gpay>paytm) {
			System.out.println("Gpay ");
		}
		else if(phonepe>gpay&&phonepe>paytm) {
			System.out.println("Phonepe");
		}
		else {
			System.out.println("Paytm");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxCashback obj=new MaxCashback();
		obj.CashBackApp();
	}
}
