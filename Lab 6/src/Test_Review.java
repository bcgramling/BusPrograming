import java.util.Arrays;
public class Test_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		double z;
		double w;
		
		//Math.Random()
		
		//1) Try to print out z as a random number between 0 and 10
		z = 0;
		System.out.println("1) z = " + z);
		
		//2) Try to print out w as a random number between -2 and 5
		w = 0;
		System.out.println("2) w = " + w);
		
		//3) Try to use Math.random() and casting
		//   to print out x as a random multiple of 5 (integer) between 0 and 100.
		x = 0;
		System.out.println("3) x = " + x);
		
		//4) Try to print out z as a percentage half of 75% = 37.5%.  Hint use %% to display % sign.
		z = 0;
		System.out.printf("4) z = %f%n", z);
		
		//5) Rewrite this with else if so that you get the correct tax rate for $100,000.
		System.out.println("5)");
		double income = 100000;
		double rate = 0.35;
		/*if (income <  47450) rate = 0.22;
		if (income < 114650) rate = 0.25;
		if (income < 174700) rate = 0.28;
		if (income < 311950) rate = 0.33;*/
		//Print out the total taxes you'll have to pay on that income in $.
	
		
		//6) What condition will cause this "While loops are great!" message to
		//   print out exactly 5 times? It's not while (x==0)
			System.out.println("6)");
			x= 10;
			while (x == 0) {
				System.out.println("While loops are great!");
				x = x+x;
			}
			
		//7) What ranges for i and j in these nested for loops could you choose
		//   to get y to print out as 15. Hint - multiple answers
			System.out.println("7)");
			y = 0;
			for (int i=0;i<0;i++) {
				y += 5;
				for (int j=0; j<0; j++) {
					y-=1;}}
					
			System.out.println("y = " + y);
			
		//8) Print out an array that is 10 entries long and is the square of the entry #
		//   Ex.  [1 4 9 16....100].  Call this array - squares_array
		//	 You'll need a for loop to populate the array.
			System.out.println("8)");
			
			
			//System.out.println(Arrays.toString(squares_array));
			}
		
	}
