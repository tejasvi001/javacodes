package standrews;

public class Student {
	
	private int rollno;
	private String name;
	
	public Student() {
		System.out.println("Student created");
	}
	public Student(int rollno) {
		
	}
	
	public Student(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}
	//setters and getters
	public int getrollno() {
		return rollno;
	}
	
	public void setrollno(int roll) {
		rollno=roll;
	}
	
	
	 void printName() //no argument no return type 
	 {
		System.out.println("Rahul");
	}
	void printName(String name) // argument but no return type 
	{
		System.out.println(name);
	}
	String getName() // no argument but return type
	{
		return "Rahul";
	}
	int square(int n) // argument and return
	{
		return n*n;
	}
}



