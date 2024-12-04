package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
	int arr[];
	Scanner sc=new Scanner(System.in);
	void initializeArray() {
		System.out.println("Enter Number of elements of array");
		arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	void showCount() {
		boolean visited[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int c=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						visited[j]=true;
						c++;
					}
				}
				System.out.println(arr[i]+":"+c);
			}
		}
	}
	void showCount2() {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int x:arr) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountFrequency obj=new CountFrequency();
		obj.initializeArray();
		obj.showCount2();
	}

}
