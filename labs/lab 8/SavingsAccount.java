
public class SavingsAccount 
			extends Account {
		
		//Create a default 
		public SavingsAccount() {
			super();
		}

		//Construct a SavingsAccount with specified id, balance 
		public SavingsAccount(int id, double balance) {
			super(id, balance);
		}

		//Decrease balance
		public void withdraw(double amount) {
			if (amount < getBalance()) {
				setBalance(getBalance() - amount);
			}
			else
				System.out.println(
					"Error! Savings account overdrawn transtaction rejected");
		}

}
