package assignments.trainLinkedlist;
public class Train {
	class Coach{
		String coach_name;
		Coach next;
		Coach(String coach_name){
			this.coach_name=coach_name;
			this.next=null;
		}
	} 
	private Coach head;
	public Train() {
		this.head=null;
	}
	public Coach add(String name) {
		Coach newCoach=new Coach(name);
		newCoach.next=head;
		head=newCoach;
		return head;
	}
	public void display() {
		// TODO Auto-generated method stub
		if(head==null) {
			System.out.println(" the train do not have any coaches");
			return;
		}
		Coach node=head;
		while(node!=null) {
			if(node.next!=null)
			    System.out.print(node.coach_name+"-");
			else
				System.out.print(node.coach_name);
			node=node.next;
		}
		System.out.println();
	}
	public void insertAfter(int n,String data) {
		int size=size(head);
		if(n<1||n>size) {
			System.out.println("Cant insert");
		}else {
			Coach new_node=new Coach(data);
			Coach temp=head;
			while(--n>0) {
				temp=temp.next;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
	}
	public void addLast(String name) {
		Coach new_node=new Coach(name);
		new_node.next=null;
		Coach temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("The Train doesnt have any coaches");
			return;
		}
		Coach temp=head;
		while(temp.next.next!=null)
			temp=temp.next;
		System.out.println("Deleted From Last: "+temp.next.coach_name);
		temp.next=null;
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.println("The Train doesnt have any coaches");
			return;
		}
		System.out.println("Deleted From First: "+head.coach_name);
		head=head.next;
	}
	public void deletemiddle(int n) {
		int size=size(head);
		if(n<1||n>size) {
			System.out.println("Deletion is not possible");
			return;
		}
		
		Coach temp=head;
		while(--n>1) {
			temp=temp.next;
		}
		System.out.println(" value deleted: "+temp.next.coach_name);
		temp.next=temp.next.next;
		
	}
	public int size(Coach node) {
		int size=0;
		while(node!=null) {
			node=node.next;
			size++;
		}
		return size;
	}
	
	public static void main(String[] args) {
		Train t=new Train();
		t.add("A1");
		t.add("A2");
		t.add("A3");
		t.add("A4");
		t.add("A5");
		t.add("<Engine>");
		t.display();
		t.insertAfter(2, "<Pantry>");
		t.display();
		t.addLast("<Engine>");
		t.display();
		t.deleteFirst();
		t.display();
		t.deleteLast();
		t.display();
		t.deletemiddle(2);
		t.display();
	}
}