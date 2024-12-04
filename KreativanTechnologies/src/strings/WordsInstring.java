package strings;

import java.util.Scanner;

public class WordsInstring {
	public static void main(String... args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Words in a string");
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(++c);
	}
}
