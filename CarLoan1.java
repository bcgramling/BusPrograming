import java.util.Scanner;

public class CarLoan1 {
    public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("What is the Principal Amount?");
		double principal = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("How Long is the loan?");
		double years = input2.nextDouble();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("What is the rate?");
		double rate = input3.nextDouble();
        
        

        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.printf("Monthly payments = $%,.2f%n", + payment);
        System.out.printf("Total interest   = $%,.2f%n", + interest);
    }

}