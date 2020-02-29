package Assignment6;

public class Account {
	
	protected String FirstName;
	protected String LastName;
	protected double CurBalance;
	
	public Account(String fname, String lname, double curbalance) {
		this.FirstName=fname;
		this.LastName=lname;
		this.CurBalance=curbalance;
	}
	
	public String getAcctType(){
		return "Account"; 
	} 
	
	public double DebitTransaction(double debitAmount) {
		return this.CurBalance-=debitAmount;
	}
	
	public double CreditTransaction(double creditAmount) {
		return this.CurBalance+=creditAmount;
	}
	
	public String toString() {
		return "Account name: " + this.FirstName + this.LastName + "\nAccount Type: " +this.getAcctType() + "\nBalance $ " + this.CurBalance;
	}
	
	public static void main(String[] argus) {
		Account a=new Account("Zehong", "Shen", 1000.0);
		a.DebitTransaction(100.0);
		a.CreditTransaction(150.0);
		System.out.println(a.CurBalance);
	}
	
	

}
