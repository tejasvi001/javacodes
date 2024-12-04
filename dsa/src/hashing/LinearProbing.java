package hashing;

public class LinearProbing {
	private int tablesize;
	private int numberofkeys;
	private Integer[] table;
	public LinearProbing() {
		this.numberofkeys=1;
		this.tablesize=10;
		this.table=new Integer[this.tablesize];
	}
	public void insert(Integer key) {
		int table_index=key%tablesize;
		int temp=table_index;
		do {
			if(table[temp]==null) {
				table[temp]=key;
				System.out.println(temp+" =" +key);
				System.out.println("number of keys in the table are"+numberofkeys);
				numberofkeys++;
				return;
			}
			temp=(temp+1)%tablesize;
		}while(temp!=table_index);
	}
	public boolean isPresent(Integer key) {
		int table_index=key%tablesize;
		Integer temp=table[table_index];
		while(temp!=null) {
			if(temp.equals(key)) return true;
			table_index=(table_index+1)%tablesize;
			if(table_index==key%tablesize) return false;
			temp=table[table_index];
		}
		return false;
	}
	public void delete(int key) {
		
	}
	public void display() {
		for(int i=0;i<tablesize;i++) {
			System.out.print(table[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinearProbing obj=new LinearProbing();
		obj.insert(5);
		obj.insert(15);
		obj.insert(7);
		obj.insert(8);
		obj.insert(6);
		obj.display();
		obj.insert(9);
		obj.display();
	}
}
