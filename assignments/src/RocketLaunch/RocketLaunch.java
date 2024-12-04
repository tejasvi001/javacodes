package RocketLaunch;

import java.util.Scanner;

public class RocketLaunch implements Water,Fuel,Power,NetLink,Oxygen{
	Scanner sc=new Scanner(System.in);
	public RocketLaunch() {
		
		System.out.println("-------------Rocket Launch-------------");
	}
	@Override
	public boolean waterCheck() {
		System.out.println("Water level Status :");
		boolean water=sc.nextBoolean();
		return water;
	}
	@Override
	public boolean powerCheck() {
		System.out.println("Power Status :");
		boolean power=sc.nextBoolean();
		return power;
	}
	@Override
	public boolean oxygenCheck() {
		System.out.println("Oxygen Level Status :");
		boolean oxygen=sc.nextBoolean();
		return oxygen;
	}
	@Override
	public boolean netLinkCheck() {
		System.out.println("Net Link Status ");
		boolean netLink=sc.nextBoolean();
		return netLink;
	}
	@Override
	public boolean fuelCheck() {
		System.out.println("Fuel Status ");
		boolean fuel=sc.nextBoolean();
		return fuel;
	}
	public boolean launchRocket() {
		int i=5;
		do {
			boolean status=true;
			switch(i) {
				case 5:
					status=waterCheck();
					break;
				case 4:
					status=powerCheck();
					break;
				case 3:
					status=oxygenCheck();
					break;
				case 2:
					status=netLinkCheck();
					break;
				case 1:
					status=fuelCheck();
					break;
			}
			if(!status) {
				return status;
			}
			i--;
		}while(i!=0);
		return true;
	}
}
