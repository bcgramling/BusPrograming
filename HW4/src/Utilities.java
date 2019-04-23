public class Utilities {

	public static double Array_Avg (double[] array) {			//set up a new array used only for average. Pull in double from main function
		double array_sum=0;
		for (int i=0; i<array.length; i++) {
			array_sum=array_sum+array[i];						//sets sum of array
		}
		double array_avg=array_sum/array.length;				//calculated average of array
		
		return array_avg;										//returns average to other functions
	}

		
	public static double Array_StdDiv (double[] array)	{		//set up a new array used only for std div
		double summation = 0;									//a new variable to keep track of sum of the summation part of the std div equation
		
		for (int j=0; j<array.length; j++) {
			summation= summation + Math.pow((array[j]- Utilities.Array_Avg(array)),2); //calculating summation for each number in array
		}
		
		double array_StdDiv = Math.sqrt((summation /(array.length-1)));					//actually calculated std div of the array of numbers
			
		return array_StdDiv;															//returns std div of array to other functions
	}	
			
				
}

