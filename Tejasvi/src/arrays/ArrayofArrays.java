package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofArrays {

	public ArrayofArrays() {
		// TODO Auto-generated constructor stub
		String _s[]= {"Name","Age","Contact","Email"};//structure
		String _s2[]=new String[4];//user input
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<_s.length;i++) {
			System.out.print(_s[i]);
			
			_s2[i]=sc.nextLine();
		}
		for(int i=0;i<_s.length;i++) {
			System.out.println(_s[i]+" :"+_s2[i]);
		}
		String _s3[]=new String[2];//arrays of arrays
		for(int j=0;j<2;j++) {
			for(int i=0;i<_s.length;i++) {
				System.out.print(_s[i]);
				_s2[i]=sc.nextLine();
			}
			_s3[j]=_s2.toString();
			_s3[j]=Arrays.toString(_s2);
		}
		for(int j=0;j<2;j++) {
			System.out.println(_s3[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayofArrays obj =new ArrayofArrays();
		System.out.println(obj.hashCode());
	}

}