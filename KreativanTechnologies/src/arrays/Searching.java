package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	 private int n;
	    private int[] array;
	    static Scanner input;
	    static {
	    	input=new Scanner(System.in);
	    	System.out.println("1D ARRAY SEARCHING");
	    }
	public Searching() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter N");
    	n=input.nextInt();
    	input();
    	output();
	}
	public void input() {
    	System.out.println("Enter the values for the array");
    	array=new int[n];
    	
    		for(int j=0;j<n ;j++) {
    			array[j]=input.nextInt();
    		}
    	
    }
    public void output() {
    	System.out.println("The values for the array are as follows");
    	
    		for(int j=0;j<n;j++) {
    			System.out.print( array[j]+" ");
    		}
    		System.out.println();
    	
    }
    public boolean linearSearch() {
    	System.out.println("Enter the no. you want to search");
    	int x=input.nextInt();
    	for(int i:array) {
    		if(i==x)
    			return true;
    	}
    	return false;
    }
    public boolean binarySearch() {
    	System.out.println("Enter the no. you want to search");
    	int x=input.nextInt();
    	Arrays.sort(array);
    	int low=0;
    	int mid,high=n-1;
    	while(low<=high) {
    		mid=low+(high-low)/2;
    		if(array[mid]==x) {
    			return true;
    		}else if(array[mid]>x) {
    			high=mid-1;
    		}else {
    			low=mid+1;
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Searching obj=new Searching();
        if(obj.binarySearch()) {
        	System.out.println("Found");
        }else {
        	System.out.println("Not Found");
        }
        if(obj.linearSearch()) {
        	System.out.println("Found");
        }else {
        	System.out.println("Not Found");
        }
	}

}
