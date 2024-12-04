package exceptions;

public class AIOOBESolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		try {
			arr[5]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
	}

}
