package week3day1Polymorphism;

public class AxisBankRtmPoly extends BankInfoOverridingParent{
	
	public void deposit() {
		super.deposit();
		System.out.println("My Deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBankRtmPoly obj=new AxisBankRtmPoly();
		obj.deposit();
		
	}

}
