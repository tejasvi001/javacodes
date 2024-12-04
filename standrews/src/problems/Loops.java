package problems;

public class Loops {
	public static int reverse(int n) {
//		int n=123;
		
		int reverse = 0;
		while(n > 0) {
			reverse += n%10;
			reverse*=10;
			n/=10;
		}
		
		return reverse;
	}
	public static int sum(int N) {
		int sum=0;
		
		while(N > 0) {
			sum += N%10;
			N/=10;
		}
		
		return sum;
	}
	public static int replace(int N, int val1,int val2) {
		int n=0;
		int multiplier = 1;
//		N = 123456     3    5
		while(N > 0) {
			int lastDigit = N%10;   // 3
//			 check if digit is same to Val_1
			if(lastDigit == val1) {   // true
				lastDigit = val2;     // 5
			}
			n+= lastDigit*multiplier;   //  456  -- 5000 + 456  = 
			multiplier*=10;  // 1000
			N/=10 ;   // 1234
			
		}
		
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234));
		System.out.println(sum(1234));
		System.out.println(replace(12345,3,5));
	}

}
