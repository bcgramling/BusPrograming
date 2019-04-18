public class Utilities {

	public static double Array_Avg (double[] array) {
		double array_sum=0;
		for (int i=0; i<array.length; i++) {
			array_sum=array_sum+array[i];
		}
		double array_avg=array_sum/array.length;
		
		return array_avg;
	}

		
	public static double Array_StdDiv (double[] array)	{
		double summation = 0;
		
		for (int j=0; j<array.length; j++) {
			summation= summation + Math.pow((array[j]- Utilities.Array_Avg(array)),2);
		}
		//double array_StdDiv = summation;
		
		double array_StdDiv = Math.sqrt((summation /(array.length-1)));
		
		return array_StdDiv;
	}
			
				
}

