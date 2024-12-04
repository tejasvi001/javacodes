package object;

public class MyClass implements Cloneable {
	private int serial_id;
	private int id;
	private String name;
	
	public MyClass(int serial_id) {
		// TODO Auto-generated constructor stub
		this.serial_id=serial_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerial_id() {
		return serial_id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1=new MyClass(10);//using new keyword
		System.out.println(obj1.hashCode());
		MyClass obj2= (MyClass) Class.forName("object.MyClass");//using Class.forName method()
		System.out.println(obj2.hashCode());

		MyClass obj3=(MyClass) obj1.clone();//clone method
		System.out.println(obj3.hashCode());

		}

}
