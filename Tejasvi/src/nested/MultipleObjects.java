package nested;

public class MultipleObjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			MultipleObjects obj=new MultipleObjects();
			System.out.println(obj.hashCode());
		}
	}
}
