
public class bank {
	
	private static double withdraw1;


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StdOut.println("Please type initial balance:");
		double balance = StdIn.readDouble();
		
		StdOut.println("Please type withdrawal amount:");
		double withdraw_money = StdIn.readDouble();
		balance = withdrawal(withdraw_money,balance);
		StdOut.println("The remaining balance is " + balance);
		
		
		StdOut.println("Please type deposit amount:");
		double direct_deposit = StdIn.readDouble();
		balance = DirectDeposit(direct_deposit,balance);
		StdOut.println("The new balance is " + balance);
	}
	
	
	public static double withdrawal(double withdraw, double balance) {
		withdraw1 = withdraw;
		while (balance-withdraw1 < 0) {
			System.out.println("Insufficient Funds");
			System.out.println("Try another amount");
			StdOut.println("Please try another amount");
			withdraw1 = StdIn.readDouble();
		}

			return balance-withdraw1;
	}
	
	
	public static double DirectDeposit(double deposit, double balance) {
			deposit = deposit *.9;
			return balance+deposit;
	}
		
/*

	Try to create your own function in here called DirectDeposit
	
*/
}
