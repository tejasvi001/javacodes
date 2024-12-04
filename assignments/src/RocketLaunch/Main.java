package RocketLaunch;

public class Main {
	public static void main(String[] args) {
		
		RocketLaunch obj=new RocketLaunch ();
		if(obj.launchRocket()) {
			System.out.println("IGNITION STAGE \n ROCKET LAUNCHED");
		}else {
			System.out.println("LAUNCH CANCELLED");
		}
		
		
		
	}
}
