package strings;

import java.util.Scanner;

public class StringClasseg {

	public StringClasseg() {
		// TODO Auto-generated constructor stub
		String _author=new String();
		System.out.print(" Enter your name :");
		Scanner sc=new Scanner(System.in);
		_author=sc.nextLine();
		int x= _author.indexOf(' ');
		String s1=_author.substring(x+1);
		String _title= new String();
		System.out.print("Enter title :");
		_title=sc.nextLine();
		String _article=new String();
		System.out.println("Enter your article");
		_article=sc.nextLine();
		System.out.println("TITLE :"+_title.toUpperCase());
		System.out.println("Author: "+s1);
		
		System.out.println(_article);  
		System.out.println("You can Enter The word you want to search in the log or article");
		String _find=sc.nextLine();
		System.out.println(_article.contains(_find));
		System.out.println("Enter any word you want to replace in the article");
		String _rep1=sc.next();
		System.out.println("Enter the new Word");
		String _rep2=sc.next();
		_article.replace(_rep1, _rep2);
		System.out.println(_article);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClasseg obj=new StringClasseg();
	}

}
