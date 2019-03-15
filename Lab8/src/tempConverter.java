
/*
 * This temperature converter will take a list of temperatures in
 * Fahrenheit and convert them all to Celsius.
 */
public class tempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 while (!StdIn.isEmpty()) {
			 double temperature = StdIn.readDouble();
			 double tempconvert = 5.0/9.0 * (temperature-32.0);
			 StdOut.printf("%.1f%n",tempconvert);
		 }
	}

}
