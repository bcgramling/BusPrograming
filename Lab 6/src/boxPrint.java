
public class boxPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // nested for loops to print box
		  int num_rows = Integer.parseInt(args[0]); //This will be the number of rows
		  int num_columns = Integer.parseInt(args[1]); //This will be the number of columns (*s)
			for (int j = 0; j < num_rows; j++)
		  {
			  for(int i = 0; i < num_columns; i++)
			  {
				  System.out.printf("*");	// prints * i times in a row
			  }
			   
			  System.out.printf("%n");		// prints a new line after a row
		  }
	}

}
