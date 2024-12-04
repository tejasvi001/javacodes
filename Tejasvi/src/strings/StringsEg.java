package strings;

public class StringsEg {

	public StringsEg() {
//		 Problem : LeetCode - 2726
		// TODO Auto-generated constructor stub
		String s1=new String("Hello");
		String s2="Hello";
		String s3=s1;
		String s4= new String("Hello");
		String s5= new String("Hello");
		System.out.println("this is string code");
		System.out.println("S1==s2: "+ (s1 == s2) );
		System.out.println("S1==s3: "+ (s1 == s3) );
		System.out.println("S1.equals(s2)"+ s1.equals(s2));
		System.out.println(s1.hashCode());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsEg obj=new StringsEg();
//		StringsEg obj2=obj1;
	}

}
