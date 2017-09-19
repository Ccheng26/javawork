package bank.test;

class Account {
	String accountHolder,type;
	static long CUSTOMERID=1000;
	long id;
	static String Bank = "CTBank";
	Savings saving= new Savings();
	Checkings checking= new Checkings();
	
	Account(String holder){
		this.accountHolder= holder;
		this.id= ++CUSTOMERID;
	};
	
	public void transferToCheckings(float amt) {
		this.saving.withdraw(amt);
		this.checking.deposit(amt);
	};
	public void transferToSaving(float amt) {
		this.checking.withdraw(amt);
		this.saving.deposit(amt);
		
	};
	public float getSavingsBalance(){
		return this.saving.getBalance();
	};
	public float getCheckingsBalance(){
		return this.checking.getBalance();
	};
	void depositToCheckings(float amt) {
		this.checking.deposit(amt);
	};
	void depositToSavings(float amt) {
		this.saving.deposit(amt);
	};
	void withdrawFromCheckings(float amt) {
		this.checking.withdraw(amt);
	};
	void withdrawFromSavings(float amt) {
		this.saving.withdraw(amt);
	};
}
