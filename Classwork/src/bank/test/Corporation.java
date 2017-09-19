package bank.test;


public class Corporation extends Account{
	Corporation(String AHolder){
		super(AHolder);
	}
	public static void main(String[] args) {
		Account account = new Individual ("bairon");
		System.out.println(account.getCheckingsBalance());
		System.out.println(account.getSavingsBalance());
	}
}
