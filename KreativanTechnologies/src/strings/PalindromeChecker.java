package strings;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
    	int n=s.length()-1;
    	for(int i=0;i<s.length()/2;i++) {
    		if(s.charAt(i)!=s.charAt(n-i)) {
    			return false;
    		}
    	}
    	return  true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Palindrome Checker");
         if(isPalindrome(sc.next())) {
        	 System.out.println("A palindrome");
         }else {
        	 System.out.println("Not a palindrome");
         }
	}

}
