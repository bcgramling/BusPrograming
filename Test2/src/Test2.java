public class Test2 {
public static void main(String[] args) {

	//java -cp bin;stdlib.jar Test2 < data.txt > results.txt
	int length_of_array = StdIn.readInt();

	double [] array1 = new double [length_of_array];
	while (!StdIn.isEmpty()) {
			for (int i =0; i< length_of_array;i++ ) {
				array1[i]=StdIn.readDouble();
			}
	}
				
		System.out.printf("%.2f%n",(sum_squares(array1)));
}
	
		public static double sum_squares (double[] array2) {
			double array_sum=0;
			for (int j=0; j<array2.length; j++) {
				array2[j]=array2[j]*array2[j];
				array_sum=array_sum+array2[j];
			}
			
			return array_sum;
			
			
		}

}
	
	
	
