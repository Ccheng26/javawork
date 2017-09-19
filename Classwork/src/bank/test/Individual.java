package bank.test;

public class Individual extends Account{ //need to extend to become a child of acct
	Individual(String AHolder){//initializing a constructor that takes a variable
		super(AHolder); 
	}
	public static void main(String[] args) { 
		//when class extends from another, you can create an object that has an 
		//obj that invokes individual constructor and obj calls the parent
		Account account = new Individual ("bairon");
		System.out.println(account.getCheckingsBalance());
		System.out.println(account.getSavingsBalance());
		account.withdrawFromSavings(5);
		account.withdrawFromCheckings(5);
		account.depositToSavings(5);
		account.depositToCheckings(5);
	}
}
