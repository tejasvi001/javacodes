package standrews;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		
		student.printName();
		student.printName("Ram");
		String name=student.getName();
		System.out.println(name);
		System.out.println(student.square(10));
	}

}
