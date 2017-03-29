
public class CheckingAccount 
			extends Account {
	private double overdraftLimit;

	//Create a default object
	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}

	//Create checking account with specified id, balance and overdraftLimit 
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	//Set new overdraft limit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	//Return overdraft limit 
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	//Decrease balance
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}

	//Return a String description of class 
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + 
		String.format("%.2f", overdraftLimit);
	}

}
