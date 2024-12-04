package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FractionalKNapStack {
	private int N;
	private int W;
	private int[] PW;
	private int[] PH;
	private Scanner input;
	
	public FractionalKNapStack(int N) {
		// TODO Auto-generated constructor stub
		input=new Scanner(System.in);
		System.out.print("N:");
		this.N=input.nextInt();
		System.out.print("W:");
		this.W=input.nextInt();
	}
	public void setProductsWeight() {
		PW=new int [N];
		System.out.println("Weights of the Products");
		for(int i=0;i<N;i++) {
			PW[i]=input.nextInt();
		}
	}
	public int[] getProductsWeight() {
		return PW;
	}
	public void setProductsHeight() {
		PH=new int [N];
		System.out.println("Profits of the Product");
		for(int i=0;i<N;i++) {
			PH[i]=input.nextInt();
		}
	}
	public int[] getProductsHeight() {
		return PH;
	}
	public void showProducts() {
		
	}
	public void doFractionalKnapStack(int[] PW,int[] PH){
		int pwlength=PW.length;
		double max_profit=0;
		List<Item> itemList=new ArrayList<>();
		for(int i=0;i<pwlength;i++) {
			itemList.add (new Item(PW[i],PH[i]));
		}
		Collections.sort(itemList,new Comparator<Item>(){
			public int compare(Item _item01,Item _item02) {
				if(_item01.profit_per_unit_weight>_item02.profit_per_unit_weight) {
					return-1;
				}
					return 1;
			}
		});
		for(int i=0;i<pwlength;i++) {
			int _weight=itemList.get(i).weight;
			int _profit=itemList.get(i).profit;
			double profit_per_unit_weight=itemList.get(i).profit_per_unit_weight;
			if(W>=_weight) {
				max_profit+=_profit;
				W-=_weight;
			}
			else {
				max_profit+=profit_per_unit_weight*W;
						W=0;
				break;
			}
		}
		System.out.println("Max Profit"+max_profit);
	}
	static class Item{
		int weight;
		int profit;
		double profit_per_unit_weight;
		Item(int weight,int profit){
			this.weight=weight;
			this.profit=profit;
			profit_per_unit_weight=(double)profit/weight;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionalKNapStack obj=new FractionalKNapStack(0);
		obj.setProductsHeight();
		obj.setProductsWeight();
		obj.doFractionalKnapStack(obj.getProductsWeight(),obj.getProductsHeight());
	}

}
