package Assignment6;

public class CheckingAccount extends Account{
	
	private static final double MinBalance=100;
	private static final double PenaltyFee=10;
	
	public CheckingAccount(String fname, String lname, double cb) {
		super(fname,lname,cb);
	}
	
	@Override
	public double DebitTransaction(double debitAmount) {
		super.DebitTransaction(debitAmount);
		ChargeFee();
		return CurBalance;
		
	}
	
	@Override
	public double CreditTransaction(double creditAmount) {
		super.CreditTransaction(creditAmount);
		ChargeFee();
		return CurBalance;
		
	}
	
	private void ChargeFee(){
		if(this.CurBalance<MinBalance) {
			this.CurBalance=this.CurBalance-PenaltyFee;
			
		}
	}
	
	public static void main(String[] argus) {
		Account a=new CheckingAccount("Zehong", "Shen", 90.0);
		a.DebitTransaction(20.0);
		//a.CreditTransaction(150.0);
		System.out.println(a.CurBalance);
	}

}
