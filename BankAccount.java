
public class BankAccount {
	private double balance; //account balance
	
	//This constructor sets the starting balance at 0.0 
	public BankAccount() {
		balance = 0.0;
	}
	
	/*
	 * Constructor sets the starting balance 
	 * to the value passed as an argument. 
	 * @param startBalance- the starting balance
	 */
	public BankAccount(double startBalance)
	{
		balance = startBalance;
	}
	
	/*
	 * This constructor sets the starting balance to the value in the String argument
	 * @param str - the starting balance as a String 
	 */
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	/* 
	 * The deposit method makes a deposit into the account 
	 * @param amount- the amount to add to the balance field 
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/*
	 * THe deposit method makes a deposit into the account 
	 * @param str- the amount to add to the balance as a String 
	 */
	public void deposit(String str)
	{
		balance += Double.parseDouble(str);
	}
	
	/*
	 * The withdraw method withdraws an amount from the account 
	 * @param amount- the amount to subtract from the balance field 
	 */
	public void withdraw(double amount) 
	{
		balance -= amount;
	}
	
	/*Withdraw method withdraws an amount from the account 
	 * @param str- the amount to subtract from the balance field as a String 
	 */
	public void withdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
	/*
	 * setBalance method sets the account balance 
	 * @param b- the value to store in the balance field
	 */
	public void setBalance(double b)
	{
		balance = b;
	}
	
	/*
	 * setBalance method sets the account balance 
	 * @param str - the value as a String to store in the balance field 
	 */
	public void setBalance(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	/*
	 * getBalance method returns the account balance
	 * @return- the value in the balance field 
	 */
	public double getBalance()
	{
		return balance;
	}
}
