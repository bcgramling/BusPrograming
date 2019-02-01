public class interest {
    public static void main(String[] args) {
		double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);
		double payment = Double.parseDouble(args[3]);
	
		double months = years * 12;		//number of months delete
		double days = years * 365.25;  // number of days
		
        double DailyRate = (rate / 100) / 365.25;   // daily interst rate
		double DailyInterest = principal * DailyRate;	//daily intereest accrued
		
		double TotalInterest = DailyInterest * days;	//total interest accured
		
		double TotalAccrued = principal + TotalInterest;
		double MonthlyInterest= TotalAccrued * DailyRate*30;
		
		System.out.printf("You will have  $%,.2f",(TotalAccrued));
		System.out.printf(" in loans after you finish school.");
		System.out.println();
		System.out.printf("Total interest at graudation = $%,.2f",(TotalInterest));
		System.out.println();
		System.out.printf("You have said your monthly payment will be $%,.2f",(payment));
		System.out.println();
		System.out.printf("Your monthly intereset is $%,.2f",(MonthlyInterest));
		System.out.println();
		
		if(MonthlyInterest>payment) {
			System.out.printf("This isn't possilbe with a monthly payment of $%,.2f",(payment));
			System.out.printf(" You'll be paying off loans forever!");
			System.out.println();
			System.out.printf("Your monthly payment must be greated than $%,.2f",(MonthlyInterest));
		}
		else {
			System.out.printf("$%,.2f",(payment));
			System.out.printf(" is an acceptable monthly payment");
		}
		

		
    }

}
