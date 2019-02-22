import java.util.Arrays;

public class Investment { 

    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);    // number of trials to perform

        int truck_thresh = 0;        // total number of bets made
        int store_thresh = 0;        // total number of games won
        
        int[] truck_array = new int[trials];
        int[] store_array = new int[trials];
        
        // repeat trials times
        for (int t = 0; t < trials; t++) {
			int store_prof  = -10000;    // store front's starting deficit
			int truck_prof   = -50000;    // food truck's starting deficit
            // do one gambler's ruin simulation
            for (int days=0; days<120; days++) {
                //These are the random variables for both store and truck:
				if ((days+1)%30==0) store_prof= store_prof - 5000; //rent for store front
				double store_rand = Math.random();
				double truck_rand = Math.random();
				
                if (store_rand < 0.30)
					store_prof=store_prof+2500;// probability of making $2500 in one day for store
                else if (store_rand < 0.70)
					store_prof=store_prof+1500;
				else store_prof=store_prof+500;
				
                if (truck_rand < 0.35)
					truck_prof=truck_prof+4000;// probability of making $2500 in one day for truck
				else if (truck_rand < 0.65)
					truck_prof=truck_prof+2000;
				else truck_prof=truck_prof-1000;
				
				
            }
            if (truck_prof >= 150000) truck_thresh++;               // did either place achieve desired goal?
			if (store_prof >= 150000) store_thresh++;
			truck_array[t] = truck_prof;
			store_array[t] = store_prof;

        }
        // print results
        System.out.println(truck_thresh + " out of " + trials + " trials the food truck produced at least $150,000 profit.");
        System.out.println(store_thresh + " out of " + trials + " trials the store front produced at least $150,000 profit.");

		System.out.println("Percent of times food truck met profit threshold = " + 100.0 * truck_thresh / trials);
		System.out.println("Percent of times store front met profit threshold = " + 100.0 * store_thresh / trials);
		int sum_truck = 0;
		int sum_store = 0;
		int max_truck = 0;
		int max_store = 0;
		int min_store = 10000000;
		int min_truck = 10000000;
		for (int i=0; i < truck_array.length;i++)
		{
			sum_truck = sum_truck + truck_array[i];
			sum_store = sum_store + store_array[i];
			if (truck_array[i] > max_truck)
				max_truck = truck_array[i];
			if (store_array[i] > max_store)
				max_store = store_array[i];
			if (truck_array[i] < min_truck)
				min_truck = truck_array[i];
			if (store_array[i] < min_store)
				min_store = store_array[i];
		}	
		//System.out.println(Arrays.toString(truck_array));
		//System.out.println(Arrays.toString(store_array));
		System.out.printf("Food Truck: %nAverage profit = $%,.2f%nMax profit = $%,d%nMin profit = $%,d%n", 
				(double) (sum_truck)/(double)(trials),max_truck,min_truck);
		System.out.printf("Store Front: %nAverage profit = $%,.2f%nMax profit = $%,d%nMin profit = $%,d%n", 
				(double) (sum_store)/(double)trials,max_store,min_store);
		
    }

}