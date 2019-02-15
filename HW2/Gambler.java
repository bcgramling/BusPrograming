import java.util.Arrays;
public class Gambler {
   public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int FT_success = 0;
        int SF_success =0;
        int[] SF = new int[trials];
		int[] FT = new int[trials];
		int SF_max = 0;
		int FT_max = 0;
		int SF_min = 1000000;
		int FT_min =1000000;
		int SF_sum = 0;
		int FT_sum = 0;
		
		
		for (int t = 0; t < trials; t++) {
				
			int FT_profit=-50000;
			int SF_profit=-10000;
			int days=1;
			while (days<121) {
				double random =Math.random();
            
				if(random <.35) FT_profit+=4000;         //FT earns $4,000 -35%
				else if (random <.65) FT_profit+=2000;   //FT earns $2,000 -30%
				else FT_profit+= -1000;                     //FT loses $1,000 -35%
        
				if(random<.3) SF_profit+=2500;           //SF earns $2,500 -30%
				else if(random<.7) SF_profit+=1500;    //SF earns $1,500 -40%
				else SF_profit+=500;                        //SF earns $500   -30%
				
				if(days==30) SF_profit+= -5000;
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
			int FT_avg = FT_sum/trials;
			int SF_avg = SF_sum/trials;
            // print results
		System.out.println(Arrays.toString(SF));
		System.out.println(Arrays.toString(FT));
        System.out.println("The Store Front reached the goal " + SF_success + " out of " + trials +" times");
        System.out.println("The Food Truck reached the goal " + FT_success + " out of " + trials +" times");
		System.out.println("The max Store Front profit was " +SF_max);
		System.out.println("The min Store Front profit was " +SF_min);
		System.out.println("The average profit of the Store Front was "+SF_avg);
		System.out.println("The max Food Truck profit was " +FT_max);
		System.out.println("The min Food Truck profit was " +FT_min);
		System.out.println("The average profit of the Food Truck was "+FT_avg);
		
    }
}