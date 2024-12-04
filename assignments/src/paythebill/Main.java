package paythebill;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayBill obj=new PayBill();
		int bill[]= {120,1200,1300,4000,70};
		obj.setBill(bill);
		obj.printBill();
		
		
		//Shallow Copy
		
		PayBill obj2=obj;
		obj2.printBill();
		bill[4]=10;
		obj.setBill(bill);
		obj2.printBill();
////		PayBill obj3 =(PayBill) obj.clone();
//		obj3.printBill();
//		bill[4]=4;
//		obj3.printBill();
			
		
		
		
		//Deep Copy
		
		PayBill obj4=new PayBill(obj);
		obj4.printBill();
		bill[4]=10;
		obj.setBill(bill);
		obj4.printBill();
	}

}
