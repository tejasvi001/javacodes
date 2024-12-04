package object;

public class MayICopyYou {
	private String name;
	public MayICopyYou(String name) {
		//super();
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public MayICopyYou(MayICopyYou obj) {
		this.name=obj.name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		MayICopyYou obj=new MayICopyYou("tim");
		System.out.println(obj.getName());
		MayICopyYou obj2=new MayICopyYou((MayICopyYou) obj);
		System.out.println(obj2.getName());
		Class obj3= Class.forName("object.MayICopyYou");
		System.out.println(obj3.getName());
		 
		
	}
	

}
