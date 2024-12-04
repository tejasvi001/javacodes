package collectionframework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner input;
	private int N;
	private int array[];
	private int index;
	
	static {
		input =new Scanner(System.in);
	}
	public Main(int N) {
		this.N=input.nextInt();
	}
	public void createArray() {
		array=new int[N];
		index=0;
	}
	public void add() {
		for(int i=0;i<N;i++) {
			array[i]=input.nextInt();
		}
	}
	//LOGIC BUILDING CODE
	public int findMiddle() {
		return array[N/2];
	}
	public int findMax() {
		Arrays.sort(array);
		return array[-1];
	}
	public void show() {
		for(int i=0;i<N;i++) {
			System.out.print( array[i]+" ");
		}
		System.out.println();
	}
	//driver code
	public static void main(String[] args) {
		int N=0;
		Main obj=new Main(N);
		obj.createArray();
		obj.add();
		obj.show();
		System.out.println(obj.findMiddle());
		System.out.println( obj.findMax());
	}
	}


