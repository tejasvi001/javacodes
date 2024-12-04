package Cashback;

public class MaxCashback implements Gpay, Phonepe, Paytm{
	
	public MaxCashback() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getpaytm() {
		// TODO Auto-generated method stub
		return PAYTM;
	}

	@Override
	public void setpaytm(int p) {
		// TODO Auto-generated method stub
		PAYTM=p;

	}

	@Override
	public int getphonepe() {
		// TODO Auto-generated method stub
		return PHONEPE;
	}

	@Override
	public void setphonepe(int p) {
		// TODO Auto-generated method stub
		PHONEPE=p;
	}

	@Override
	public int getgpay() {
		// TODO Auto-generated method stub
		return GPAY;
	}

	@Override
	public void setgpay(int p) {
		// TODO Auto-generated method stub
		GPAY=p;
	}
	public String maxcashback() {
		String s;
		if((GPAY>PHONEPE)&&(GPAY>PAYTM)) {
			s="GPAY GIVES MAXIMUM CASHBACK";
		}else if(PHONEPE>GPAY&&PHONEPE>PAYTM) {
			s="PHONEPE GIVES MAXIMUM CASHBACK";
		}else {
			s="PAYTM GIVES MAXIMUM CASHBACK";
		}
		return s;
	}
	
}
