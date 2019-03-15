//Bryce Gramling Exam 1

import java.util.Arrays;
public class exam {
   public static void main(String[] args) {
        double[] sales = new double[12];				//sales for 12 months.
		double[] costs = new double[12];				//costs for 12 months
		double[] profits = new double[12];				//profits for 12 months
		double sales_variable =20000.00;				//variable used to calculate across each month									//first months sales of $20,000
		double COGS_percent = 0.5;						//variable used to calculate COGS percentage of sales across each month
		double profits_sum=0;							//used to do sum and calc average later
		
		for (int t = 0; t <12; t++){
			
			sales[t]=sales_variable;					//calcualtes sales for each month
			costs[t]=COGS_percent * sales[t];			//calcuates costs for each month
			profits[t]=sales[t]-costs[t];				//calcualtes profit for each month
			
			profits_sum = profits_sum+sales[t];			//creates a running total for profits
			sales_variable=sales_variable*1.25;			//sets next months sales 
			COGS_percent = COGS_percent-.02;			//sets next months cogs percent of sales for next month
			
		}
		
		double profits_avg = profits_sum/12;		//calcualtes average profits
		
		System.out.println("The sales array is:");
		System.out.println(Arrays.toString(sales));
		System.out.println("The costs array is:");
		System.out.println(Arrays.toString(costs));
		System.out.println("The profits array is:");
		System.out.println(Arrays.toString(profits));
		System.out.printf("Average profit = $%,.0f%n",(profits_avg));
		
    }
}