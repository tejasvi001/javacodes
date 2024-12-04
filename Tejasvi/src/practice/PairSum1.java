package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PairSum1 {

	public PairSum1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Enter Number of elements you want to enter");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			obj.add(sc.nextInt());
		}
		System.out.println(obj);
		System.out.println("enter the target amount");
		int target=sc.nextInt();
		System.out.println(pairSum1(obj,target));
		System.out.println(pairSum(obj,target));
		System.out.println(isMonotonic(obj));
	}
	private static boolean isMonotonic(ArrayList<Integer>obj) {
		boolean result=true;
		if(obj.get(0)<obj.get(1)) {
			for(int i=0;i<obj.size()-1;i++) {
				if(obj.get(i)>obj.get(i+1)) {
					result=false;
				}
			}
		}else {
			for(int i=0;i<obj.size()-1;i++) {
				if(obj.get(i)<obj.get(i+1)) {
					result=false;
				}
			}
		}
		return result;
	}
	private static int pairSum(ArrayList<Integer> obj,int target) {
		int n=0;
		for(int i=0;i<obj.size();i++) {
			for(int j=i+1;j<obj.size();j++) {
				if((obj.get(i)+obj.get(j))==target){
					n++;
				}
			}
		}
		return n;
	}
	private static int pairSum1(ArrayList<Integer> obj,int target) {
		int n=0;
		Collections.sort(obj);
		int i=0,j=obj.size()-1;
		while(i<j) {
			if((obj.get(i)+obj.get(j))==target){
				n++;
				j--;
				i++;
			}
			else if((obj.get(i)+obj.get(j))>target){
				j--;
			}else {
				i++;
			}
		}
		return n;
	}
}
