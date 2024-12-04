package BitManipulation;

public class Operations {
	public int getIthBit(int n,int i) {
		int bitmask=(1<<i);
		if((n&bitmask)==0)
			return 0;
		return 1;
//		return (n&bitmask);
	}
	public int updateIthBit(int n,int i,int k) {
		//1|n=1
		//0&n=0
		int bitmask=1<<i;
		if(k==1) {
		   n=(n|bitmask);
		}else {
			bitmask=~bitmask;
			n=(n&bitmask);
		}
		return n;
	}
	public int setIthBit(int n,int i) {
		//1|n=1
		//0&n=0
		int bitmask=1<<i;
	
		   n=(n|bitmask);
		
		return n;
	}
	public int clearIthBit(int n,int i) {
		int bitmask=1<<i;
		bitmask=~bitmask;
		n=(n&bitmask);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Operations obj=new Operations();
       System.out.println(obj.getIthBit(15, 2));
       System.out.println(obj.updateIthBit(10, 1, 0));
       System.out.println(obj.setIthBit(10, 2));
       System.out.println(obj.clearIthBit(10, 1));
	}

}
