package BitManipulation;

public class BitwiseAnd {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5&6);	//Bitwise And (both 1)
		System.out.println(5|6);	//Bitwise Or  (single 1)
		System.out.println(5^6);	//Bitwise Xor (diff=1)
		System.out.println(~5);     //Bitwise 1's Compliment(not)
		System.out.println(~0);
		System.out.println(5<<2);   //Bitwise Left shift
		System.out.println(6>>1);   //Bitwise Right shift
	}
}
