import javax.swing.JOptionPane;

public class AccountTest {
	public static void main(String []args)
	{
		
		//get the starting balance 
		String input;
		input = JOptionPane.showInputDialog(
				"What is your account's starting balance?");
		
		//create a BankAccount object 
		BankAccount account = new BankAccount(input);
		
		//get the amount of pay 
		input = JOptionPane.showInputDialog(
				"How much were you paid this month?");
		
		//deposit the user's pay into the account 
		account.deposit(input);
		
		//Display the new balance
		JOptionPane.showMessageDialog(null,
				String.format("Your pay has been deposited .\n"+
		"Your current balance is $%,.2f", account.getBalance()));
		
		//Withdraw come cash from the account 
		input = JOptionPane.showInputDialog(null, 
				"How much would you like to withdraw?");
		account.withdraw(input);
		
		//display the new balance 
		JOptionPane.showMessageDialog(null, 
				String.format("Now your balance is $%,.2f", 
						account.getBalance()));
		
		System.exit(0);
	}
}
