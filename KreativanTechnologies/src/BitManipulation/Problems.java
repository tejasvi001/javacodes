package BitManipulation;

public class Problems {
	public void oddOrEven(int n) {
    	int bitmask=1;
    	if((n&bitmask)==0) {
    		System.out.println("Even");
    	}else {
    		System.out.println("Odd");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problems obj=new Problems();
		obj.oddOrEven(4);//even 
		obj.oddOrEven(5);//odd
	}

}
