public class Test {
public static void main(String[] args) {

	//java -cp bin;stdlib.jar Test < data.txt > results.txt
		int length_of_array = StdIn.readInt();						//read in the length of the array from the input file

		double [] array = new double [length_of_array];				//create new array and set the length of the array
		for (int i =0; i< length_of_array;i++ ) {					//put in the values from the text file into the array
			array[i]=StdIn.readDouble();
		}		
				
		System.out.printf("Standard Diviation: %.2f%n",(Utilities.Array_StdDiv(array)));	//print the std div using the std div function in the utilities file
		System.out.printf("Average: %.2f%n" , (Utilities.Array_Avg(array)));				//print the average using the average function in the utilities file
				
		}
	
				
				
				
				
}
