public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//*0)	
	double array1[] = {4.7,5.4,3.2,4.9};
	double average = average_calc(array1);
	System.out.println(average);
	
	/*1) Create a new function - average_calc2 that accepts
	 * two arguments: the array and a multiplier.  Put the 
	 * multiplier variable in your main and call the function
	 * in your main method. It should be similar to average calc
	 * except that you use a multiplier. Return and print the product
	 * of the average and the multiplier.
	 */
	double multiplier = 5.0;
	
	
	/*2) Read in array2 from the text file ave_array.txt. 
	 * The first number is the length of array2.
	 *  Then try to pass it to both of your functions (can use same multiplier) and
	 *  return answers (average3 and average4) as standard output in results.txt
	 *  Use java -cp bin;stdlib.jar Average < ave_array.txt > results.txt for PC
	 *  or java -cp bin:stdlib.jar Average < ave_array.txt > results.txt for Mac
	 */
	
	/*3) Try the same as above but with a multi-dimensional array.
	 * You can read in array3 from the same ave_array.txt file and declare 
	 * and initialize it in the java program here.  
	 * Create a new function average_calc3
	 * that accepts a multi-dimensional array and multiplier.  Print
	 * average5 as standard output to results.txt as well.
	 */
	
	
	
    /*  Below are the answers assuming your multiplier is 5.
     *  0) 4.550000000000001
		1) 22.750000000000004
		2) 17.5
		2) 87.5
		3) 24.749999999999996
     * 
     */
	
	
	
	
	
	}
	public static double average_calc(double[] ave_array) {
		double sum = 0;
		for (int i =0;i<ave_array.length;i++) {
			sum += ave_array[i];
		}
		return sum/ave_array.length;
	}
}
