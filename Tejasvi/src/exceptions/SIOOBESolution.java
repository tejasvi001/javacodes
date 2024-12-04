package exceptions;

public class SIOOBESolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Aman";
		try {
			System.out.println(name.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}
