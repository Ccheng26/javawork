package bank.test;

class Checkings {
	float balance;
	
	public Checkings() {
		this.balance= 0f;
	}
	void deposit(float deposit) {
		balance = this.balance + deposit;
	};
	void withdraw(float withdraw) {
		balance = this.balance - withdraw;
	};
	float getBalance() {
		return this.balance;
	};
}
