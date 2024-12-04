package hashing;

import java.util.Scanner;

class HashTable{
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		HashNode(Integer key,String value){
			this.key=key;
			this.value=value;
		}
	}
	private HashNode[] buckets;
	private int size;
	private int bucketIndex;
	private int totalBucketSize;
	private int emptyBuckets;
	private int occupiedBuckets;
	public HashTable(int totalBucketSize) {
		this.size=0;
		this.totalBucketSize=totalBucketSize;
		this.buckets=new HashNode[totalBucketSize];
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int hashCode(Integer key) {
		return key%totalBucketSize;
	}
	public int getBucketIndex(Integer key) {
		return hashCode(key);
	}
	public int getBucketSize() {
		return totalBucketSize;
	}
	public void put(Integer key,String value) {
		bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		head=buckets[bucketIndex];
		HashNode node=new HashNode(key,value);
		node.next=head;
		buckets[bucketIndex]=node;
		size++;
	}
	public void getBucketDetails() {
		occupiedBuckets=0;
		emptyBuckets=0;
		for(int i=0;i<totalBucketSize;i++) {
			System.out.println("["+i+"]");
			HashNode head=buckets[i];
			while(head!=null) {
				++occupiedBuckets;
				System.out.println("\t"+head.key+"-"+head.value);
				head=head.next;
			}
			emptyBuckets=totalBucketSize-occupiedBuckets;
		}
	}
	public String search(Integer key) {
		bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}else {
				head=head.next;
			}
		}
		return null;
	}
	public String delete(Integer key) {
		bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		HashNode prev=null;
		while(head!=null) {
			if(head.key.equals(key)) break;
				prev=head;
				head=head.next;
		}
		if(head==null) {
			return null;
		}
		if(prev!=null) {
			prev.next=head.next;	
		}else {
			buckets[bucketIndex]=head.next;
		}
		size--;
		return head.value;
	}
}
public class SeparateChaining {
	private static Scanner input;
	private HashTable objHashTable;
	private int N;
	static {
		input=new Scanner(System.in);
	}
	public SeparateChaining(int N) {
		System.out.println("N: ");
		this.N=input.nextInt();
	}
	public int getN() {
		return this.N;
	}
	public HashTable getHashTableInstance(int N) {
		return objHashTable=new HashTable(N);
	}
	public static void main(String[] args) {
		SeparateChaining obj=new SeparateChaining(0);
		HashTable objHashTable=obj.getHashTableInstance(obj.getN());
		objHashTable.put(45, "Michael Jordan");
		objHashTable.put(25, "Kobe Bryant");
		objHashTable.put(15, "Klay Johnson");
		objHashTable.put(12, "Kelvin Durant");
		objHashTable.put(05, "Steph Curry");
		objHashTable.put(22, "Lebron James");
		objHashTable.getBucketDetails();
		System.out.println("Search 25 "+objHashTable.search(25));
		System.out.println("Search 26 "+objHashTable.search(26));
		System.out.println("15 deleted "+objHashTable.delete(15));
		objHashTable.getBucketDetails();
	}
}