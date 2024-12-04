package loops;

import java.util.Scanner;

public class TollTaxApp {

	public TollTaxApp() {
		System.out.println("TOLL TAX APP");
		Scanner input=new Scanner(System.in);
		int tollTax=100;
		boolean paid=false;
		/*while(paid != true ){
			System.out.println("Please Pay the Tolltax"+ tollTax);
			paid=input.nextBoolean();
		}*/
		do{
			System.out.println("Please Pay the Tolltax"+ tollTax);
			paid=input.nextBoolean();
		}while(paid != true );
	}

	public static void main(String[] args) {
		TollTaxApp obj=new TollTaxApp();

	}

}
