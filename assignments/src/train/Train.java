package train;

import java.util.Scanner;

/*
 * ticketbook
 * seatno
 * trainno
 * reverse booking not possible
 * train same no(701-702)
 * stations(all)
 * stations (board deboard)
 * stations (break)
 * back
 * name
 * phone no
 * 
 * */
 
public class Train {
	int d,a;
	public Train() {
		// TODO Auto-generated constructor stub
		System.out.println("Train Application");

		String _fields[]= {"Name", "Contact", "Train no","Departstation","Arrivalstation","in-out status"};
		String _stations[]= {"Jammu", "Delhi","Indore","Bhopal","Banglore","Kerela"};
		String _values[]=new String[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
				System.out.print("Enter "+_fields[i]+" :");
				_values[i]=sc.nextLine();
		}
		
		for(int i=0;i<6;i++) {
			if(_stations[i].equals(_values[3])) {
				d=i;
			}
			if(_stations[i].equals(_values[4])) {
				a=i;
			}
		}
		if(Integer.parseInt(_values[2])%2==1) {
			
			if(d<a) {
				for(int i=d;i<=a;i++) {
					System.out.println(" we are at station "+_stations[i]+" are you in(yes/no)");
					String status=sc.next();
					_values[5]=_stations[i];
					if(status.equals("no")) {
						break;
					}
				}
				System.out.println("You are not in the train from "+_values[5]);
			}else {
				System.out.println("Not a valid booking");
			}
		}
		else {
			
			if(d>a) {
				for(int i=d;i>=a;i++) {
					System.out.println(" we are at station"+_stations[i]+"are you in(yes/no)");
					String status=sc.next();
					_values[5]=status.concat(_stations[i]);
					if(status.equals("no")) {
						break;
					}
				}
				System.out.println("You are not in the train from"+_values[5]);
			}else {
				System.out.println("Not a valid booking");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train obj=new Train();
}
}
