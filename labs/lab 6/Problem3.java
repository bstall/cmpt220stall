import java.util.Date;
public class Problem3 {

	public static void main(String[] args) {
		//Problem 9.7
		class Account {
			// Data 
			private int id;
			private double balance;
			private double annualInterestRate;
			private Date dateCreated;

			// Constructors
			//Creates a default account 
			Account() {
				id = 0;
				balance = 0;
				annualInterestRate = 0;
				dateCreated = new Date(); 
			}

			// Creates an account with id and initial balance 
			Account(int newId, double newBalance) {
				id = newId;
				balance = newBalance;
				dateCreated = new Date();
			}

			//Set id 
			public void setId(int newId) {
				id = newId;
			}

			//Set balance 
			public void setBalance(double newBalance) {
				balance = newBalance;
			}

			//Set annual interest rate
			public void setAnnualInterestRate(double newAnnualInterestRate) {
				annualInterestRate = newAnnualInterestRate;
			}

			// Return id 
			public int getId() {
				return id;
			}

			// Return balance 
			public double getBalance() {
				return balance;
			}

			// Return annual interest rate
			public double getAnnualInterestRate() {
				return annualInterestRate;
			}

			// Return date created
			public String getDateCreated() {
				return dateCreated.toString();
			}

			// Return monthly interest rate 
			public double getMonthlyInterestRate() {
				return annualInterestRate / 12;
			}

			// Return monthly interest 
			public double getMonthlyInterest() {
				return balance * (getMonthlyInterestRate() / 100);
			}

			// Decrease balance 
			public void withdraw(double amount) {
				balance -= amount;
			}

			// Increase balance 
			public void deposit(double amount) {
				balance += amount;
			}
		}
		// Create an Account object
				// ID and balance set
				Account account = new Account(1122, 20000);

				// Set annual interest rate
				account.setAnnualInterestRate(4.5);

				// Withdraw 
				account.withdraw(2500);

				// Deposit
				account.deposit(3000);

				// Display the balance, the monthly interest, and date created
				System.out.println("\n          Account Statement");
				System.out.println("------------------------------------------");
				System.out.println("Account ID: " + account.getId());
				System.out.println("Date created: " + account.getDateCreated());
				System.out.printf("Balance: $%.2f\n", account.getBalance());
				System.out.printf("Monthly interest: $%.2f\n", 
					account.getMonthlyInterest());
		}

}


