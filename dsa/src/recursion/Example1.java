package recursion;

public class Example1 {
	
	private boolean answer[]= {true,true,true,true,true};
	public boolean recursion(int counter,String doYou) {
	
		if(counter<answer.length&&doYou=="NO") {
			return false;
		}
		System.out.println(answer[counter]);
		counter++;
		return recursion(counter,"NO");
	}
	public void dream(int dream) {
		
	}
	String str="Hello World";
	public void print(int i) {
		if(i>=str.length()) {
			return;
		}
		System.out.print(str.charAt(i));
		i++;
		print(i);
	}
	public void print(String s) {
		if(s.length()==0) {
			return;
		}
		System.out.print(s.charAt(0));
		print(s.substring(1));
	}
	public void printreverse(String s) {
		if(s.length()==0) {
			return;
		}
		System.out.print(s.charAt(s.length()-1));
		printreverse(s.substring(0,s.length()-1));
//		printreverse(s.substring(1));
//		System.out.println(s.charAt(0));
	}
	public int addnaturalno(int number) {
		if(number==0) {
			return number;
		}else {
			return number+addnaturalno(number-1);
		}
	}
	int counter=0;
	public void printString(String s) {
		if(s.length()==0) {
			return;
		}
		++counter;
		for(int i=0;i<counter;i++) {
			System.out.print(s.charAt(0));
		}
		System.out.println();
		printString(s.substring(1));
	}
	public int sumBetweenTwoNumbers(int start,int end) {
		if(start>end) {
			return 0;
		}else {
			return start+sumBetweenTwoNumbers(start+1,end);
		}
	}
	public int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	static String s="RECURSION";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
		obj.recursion(3, "Yes");
		obj.print("Hello");
		System.out.println();
		obj.printString("RECURSION");
		
		//obj.reverse(s);
		obj.print(s);
		System.out.println();
		obj.printreverse(s);
		System.out.println();
		System.out.println(obj.addnaturalno(10));
		System.out.println(obj.sumBetweenTwoNumbers(1, 10));
		System.out.println(obj.fact(5));
	}

}
