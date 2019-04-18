public class Test {
public static void main(String[] args) {

	//java -cp bin;stdlib.jar Test < data.txt > results.txt
		int length_of_array = StdIn.readInt();

		double [] array = new double [length_of_array];
		for (int i =0; i< length_of_array;i++ ) {
			array[i]=StdIn.readDouble();
		}		
				
		System.out.printf("Standard Diviation: %.2f%n",(Utilities.Array_StdDiv(array)));
		System.out.printf("Average: %.2f%n" , (Utilities.Array_Avg(array)));
				
		}
	
				
				
				
				
}
