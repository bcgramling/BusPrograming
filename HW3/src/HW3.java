public class HW3 {
public static void main(String[] args) {

	//java -cp bin;stdlib.jar HW3 < five_by_five.txt > spreadsheet.txt
	int rows = StdIn.readInt();
	int cols = StdIn.readInt();
	double cols_sum =0.0;
	double rows_sum=0;
	double total_sum=0;

	double [][] array1 = new double [rows+2][cols+2];
	while (!StdIn.isEmpty()) {
		
		for (int j=0; j<rows;j++) {
			for (int i =0; i< cols;i++ ) {
				array1[j][i]=StdIn.readDouble();
				rows_sum=rows_sum+array1[j][i];
				array1[j][cols] = rows_sum;
				array1[j][cols+1] = rows_sum/rows;
			}
		rows_sum=0;
		}
	}
			
	for (int i=0; i<cols;i++) {
		for (int j =0; j< rows;j++ ) {	
			cols_sum=cols_sum+array1[j][i];
			array1[rows][i] = cols_sum;
			array1[rows+1][i] = cols_sum/cols;
		}
		total_sum=total_sum+cols_sum;
		cols_sum=0;	
	}
	array1 [rows+1][cols+1]= total_sum/cols/cols;
	
	for (int i=0; i<rows+2;i++) {
		for(int j=0; j<cols+2;j++) {
		StdOut.printf("%.1f\t|",array1[i][j]);
		}
		System.out.println();
	}
}
	
	
}
	
	
	
