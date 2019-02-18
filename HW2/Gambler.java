import java.util.Arrays;
public class Gambler {
   public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
<<<<<<< HEAD
        int FT_success = 0;							//number of trials food truck meets goal
        int SF_success =0;							//number of trials store front meets goal
        int[] SF = new int[trials];
		int[] FT = new int[trials];
		double SF_max = 0;							//variable used for Store front max
		double FT_max = 0;							//variable used for food truck max
		double SF_min = 1000000;					//variable used for store front min
		double FT_min = 1000000;					//variable used for food truck min
		double SF_sum = 0;							//variable used later to calcucate store front avg
		double FT_sum = 0;							//variable used later to calculate food truck avg
=======
        int FT_success = 0;
        int SF_success =0;
        double[] SF = new double[trials];
		double[] FT = new double[trials];
		double SF_max = 0;
		double FT_max = 0;
		double SF_min = 1000000;
		double FT_min =1000000;
		double SF_sum = 0;
		double FT_sum = 0;
>>>>>>> 991c02388e65b31d9630fdfb04d856fca2bdf68c
		
		
		for (int t = 0; t < trials; t++) {
				
			int FT_profit=-50000;					//food truck start up cost
			int SF_profit=-10000;					//store front start up cost
			int days=1;								//reset days to 1 after each trial
			while (days<121) {
				double random =Math.random();		
            
				if(random <.35) FT_profit+=4000;         //FT earns $4,000 -35%
				else if (random <.65) FT_profit+=2000;   //FT earns $2,000 -30%
				else FT_profit+= -1000;                     //FT loses $1,000 -35%
        
				if(random<.3) SF_profit+=2500;           //SF earns $2,500 -30%
				else if(random<.7) SF_profit+=1500;   	 //SF earns $1,500 -40%
				else SF_profit+=500;                     //SF earns $500   -30%
				
				if(days==30) SF_profit+= -5000;			//store front rent is every 30 days
				if(days==60) SF_profit+= -5000;
				if(days==90) SF_profit+= -5000;
				if(days==120) SF_profit+= -5000;
				days = days+1;
			}
				SF[t] = SF_profit;
				FT[t] = FT_profit;
				
				if(SF_max <SF[t]) SF_max=SF[t];
				if(SF_min >SF[t]) SF_min=SF[t];
				
				if(FT_max <FT[t]) FT_max=FT[t];
				if(FT_min >FT[t]) FT_min=FT[t];
				
				SF_sum=SF_sum+SF[t];
				FT_sum=FT_sum+FT[t];
		
			if (SF_profit >=150000) SF_success++;
			if (FT_profit >=150000) FT_success++; 
		
		}  
			double FT_avg = FT_sum/trials;
			double SF_avg = SF_sum/trials;
            // print results
		System.out.println(Arrays.toString(SF));
		System.out.println(Arrays.toString(FT));
		System.out.println();
        System.out.println("The Store Front reached the goal " + SF_success + " out of " + trials +" times");
        System.out.println("The Food Truck reached the goal " + FT_success + " out of " + trials +" times");
		System.out.println();
<<<<<<< HEAD
		System.out.println("Store Front:");
		System.out.printf("Max profit = $%,.0f%n",(SF_max));
		System.out.printf("Min profit = $%,.0f%n",(SF_min));
		System.out.printf("Average profit = $%,.0f%n",(SF_avg));
		System.out.println();
		System.out.println("Food Truck:");
		System.out.printf("Max profit = $%,.0f%n",(FT_max));
		System.out.printf("Min profit = $%,.0f%n",(FT_min));
		System.out.printf("Average profit = $%,.0f%n",(FT_avg));
=======
		System.out.println("The max Store Front profit was $%,.0f%n",(SF_max));
		System.out.println();
		System.out.println("The min Store Front profit was $%,.0f%n",(SF_min));
		System.out.println();
		System.out.println("The average profit of the Store Front was $%,.0f%n",(SF_avg));
		System.out.println();
		System.out.println("The max Food Truck profit was $%,.0f%n",(FT_max));
		System.out.println();
		System.out.println("The min Food Truck profit was $%,.0f%n",(FT_min));
		System.out.println();
		System.out.printf("The average profit of the Food Truck was $%,.0f%n",(FT_avg));
>>>>>>> 991c02388e65b31d9630fdfb04d856fca2bdf68c
		
    }
}