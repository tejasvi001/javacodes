package paythebill;

public class PayBill  implements Cloneable{
	private int bill[]=new int[5];
	public PayBill() {
		
	}
	public PayBill(PayBill obj) {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++) {
			this.bill[i]=obj.bill[i];
		}
	}

	public int[] getBill() {
		return bill;
	}

	public void setBill(int[] bill) {
		this.bill = bill;
	}
	public void printBill() {
		System.out.println("Mobile : "+bill[0]);
		System.out.println("Rent : "+bill[1]);
		System.out.println("Cab : "+bill[2]);
		System.out.println("Internet : "+bill[3]);
		System.out.println("Water : "+bill[4]);
		
	}
	/*public static void main(String[] args) {
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
		try {
			PayBill obj3 =(PayBill) obj.clone();
			obj3.printBill();
			bill[4]=4;
			obj3.printBill();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Deep Copy
		
		PayBill obj4=new PayBill(obj);
		obj4.printBill();
		bill[4]=10;
		obj.setBill(bill);
		obj4.printBill();
	}
	*/
}
