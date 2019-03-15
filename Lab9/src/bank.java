
public class bank {
	
	public static void main(String[] args) {
		double balance;
		// TODO Auto-generated method stub
		balance = 100;
		
		//Here we are going to call the function withdrawal.
		//We need to pass two arguments to this function.
		//We are going to use Std.In to get the withdrawal amount.
		StdOut.println("Please type withdrawal amount:");
		double withdraw_money = StdIn.readDouble();
		balance = withdrawal(withdraw_money,balance);
		StdOut.println("The remaining balance is " + balance);
		
		
		StdOut.println("Please type deposit amount:");
		//  ??????? Make a new variable called deposit_money
		//  balance = ???????   Call the 
		StdOut.println("The remaining balance is " + balance);
	}
	
	
	public static double withdrawal(double withdraw, double balance) {
		if (balance-withdraw > 0)
			return balance-withdraw;
		else
			System.out.println("Insufficient Funds");
			return balance;
	}
	
/*

	Try to create your own function in here called DirectDeposit
	
*/
}
