
public class Problem2 {
	//Problem 11.3
	public static void main(String[] args) {
		// Create objects
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		
		//Set annual interest rate of 5%
		account.setAnnualInterestRate(5);
		savings.setAnnualInterestRate(5);
		checking.setAnnualInterestRate(5);

		//Withdraw $3,000
		account.withdraw(3000);
		savings.withdraw(3000);
		checking.withdraw(3000);

		//Deposit $5,000
		account.deposit(5000);
		savings.deposit(5000);
		checking.deposit(5000);

		//Invoke toString methods
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}

}
