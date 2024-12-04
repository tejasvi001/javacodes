package practice;

import java.util.Arrays;

public class SearchingSorting {
	public boolean linearsearch(int data[],int x) {
		for(int i=0;i<data.length;i++) {
			if(data[i]==x) {
				return true;
			}
		}
		return false;
	}
	public boolean binarysearxh(int data[],int x) {
		Arrays.sort(data);
		int low=0;
		int high=data.length-1;
		int mid;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(x==data[mid])
				return true;
			else if(data[mid]>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return false;
	}
	public void bubblesort(int data[]) {
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[j]>data[j+1]) {
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
	}
	public void selectionsort(int data[]) {
		for(int i=0;i<data.length;i++) {
			int k=i;
			for(int j=i+1;j<data.length;j++) {
				if(data[k]>data[j]) {
					k=j;
				}
			}
			if(k!=i) {
				int temp=data[i];
				data[i]=data[k];
				data[k]=data[i];
			}
		}
	}
	public void insertionsort(int data[],int x) {
		for(int i=1;i<data.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(data[j]<data[j-1]) {
					int temp=data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
				}
			}
		}
	}
	public void mergesort(int data[]) {
		int N=data.length;
		if(N<=1) {
			return;
		}
		int mid = N/2;
		int left[]=new int[mid];
		for(int i=0;i<mid;i++) {
			left[i]=data[i];
		}
		int right[]=new int[N-mid];
		for(int i=mid;i<N;i++) {
			right[i-mid]=data[i];
		}
		mergesort(left);
		mergesort(right);
		merge(data,left,right);
		
	}
	public void merge(int data[],int left[],int right[]) {
		int ll=left.length;
		int rl=right.length;
		int i=0,j=0,k=0;
		while(i<ll&&j<rl) {
			if(left[i]<right[j] ){
				data[k]=left[i];
				i++;
			}else {
				data[k]=right[j];
				j++;
			}k++;
		}
		while(i<ll) {
			data[k]=left[i];
			i++;
			k++;
		}
		while(j<rl) {
			data[k]=right[j];
			j++;
			k++;
		}
	}
	public void quicksort(int data[],int start,int end) {
		if(start<=end) {
			return;
		}
		int pivot = data[endindex];
		int leftpointer=startindex;
		int rightpointer=endindex;
		while(leftpointer<rightpointer) {
			while(data[leftpointer]<=pivot&&leftpointer<rightpointer) {
				leftpointer++;
			}
			while(data[rightpointer]>=pivot&&rightpointer>leftpointer) {
				rightpointer--;
			}
			//for every while condition swap the values
			swap(data,leftpointer,rightpointer);
		}
		//when both the pointers reach at same index
		//swap the left pointer with the pivot
		swap(data,leftpointer,endindex);
		//quick sort at left part
		 doQuickSort(data,startindex,leftpointer-1);
		//quick sort at right part
		 doQuickSort(data,leftpointer +1,endindex);
	}
}
