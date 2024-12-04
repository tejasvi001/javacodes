package nested;

import java.util.Scanner;

public class TimeTable {
	private int time;
	private final static int EXPECTED_ACTIVITIES=4;
	Scanner sc= new Scanner (System.in);
	public TimeTable() {
		// TODO Auto-generated constructor stub
		System.out.println("Your Time Table");
	}
	public void morningTimeTable(int time) {
		System.out.println("Morning Time Table");
		class Morning{
			
			public void wakeup(int time) {
				System.out.println("Wake up : "+time);
			}
			public String[] getActivities() {
				String[] morning_activities= new String[EXPECTED_ACTIVITIES];
				//Can add any code which will state 
				System.out.println("Enter Activities");
				for(int i=0;i<4;i++)
					morning_activities[i]=sc.next();
				
				return morning_activities;
			}
		}
		Morning obj=new Morning();
		obj.wakeup(time);
		
		for (String data :obj.getActivities() ) {
			System.out.println(data);
		}
	}
	public void noonTimeTable(int time) {
		System.out.println("Noon Time Table");
		class Noon{
		
			public String getActivities() {
				String[] noon_activities= new String[EXPECTED_ACTIVITIES];
				//...
				return noon_activities.toString();
			}
		}
		Noon obj=new Noon();
		
	}
	public void eveningTimeTable(int time) {
		System.out.println("Evening Time Table");
		class Evening{
			
			public String getActivities() {
				String[] evening_activities= new String[EXPECTED_ACTIVITIES];
				//...
				return evening_activities.toString();
			}
		}
		Evening obj=new Evening();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeTable obj=new TimeTable();
		int time=5;
		obj.morningTimeTable(time);
	}

}
