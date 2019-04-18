
public class Test2 {
	 public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);

	        // sum of square roots of integers from 1 to n using Math.sqrt(x).
	        Stopwatch timer1 = new Stopwatch();
	        double sum1 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum1 += Math.sqrt(i);
	        }
	        double time1 = timer1.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum1, time1);

	        // sum of square roots of integers from 1 to n using Math.pow(x, 0.5).
	        Stopwatch timer2 = new Stopwatch();
	        double sum2 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum2 += Math.pow(i, 0.5);
	        }
	        double time2 = timer2.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum2, time2);
	        
	        Stopwatch timer3 = new Stopwatch();
	        double sum3 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum3 += Math.random()*i;
	        }
	        double time3 = timer3.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum3, time3);
	        
	        ///Here we're going to test Math.pow vs. our own function:
	        Stopwatch timer4 = new Stopwatch();
	        double sum4 = 0.0;
	        for (int i = 1; i <= n; i++) {
	            sum4 += (Math.pow(i, 2) / (i+1));
	        }
	        double time4 = timer4.elapsedTime();
	        System.out.printf("%e (%.2f seconds)\n", sum4, time4);
	        
	        //Your function will return a double that is the sum.
	        //You only need to pass n over to the function.
	        //Use the same thing as with sum4, but instead of using
	        //Math.pow  use i*i
	    
	    }
	/* 
	 public static double practice_function(????passing n) {
		 double sum5 = 0.0;
	        for (int i = 1; i <= ??????; i++) {
	           ????????
	        }
	        
	        return sum5;
		 
	 }*/
	 //***See if you can build a function similar to the Math.pow() and Math.sqrt() above that will
	 //use the Stopwatch object to time it.  Suggest using for loops and creating another object
	 //Make sure to declare your data type Stopwatch timer3 = new Stopwatch();***
	 
}
