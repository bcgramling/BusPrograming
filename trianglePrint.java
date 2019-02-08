public class trianglePrint {

	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]); 
		int c = Integer.parseInt(args[1]); 
		
			for (int i=0; i<r; i++)
		  {
			  for(int j=0; j<c; j++)
			  {
				  System.out.printf("*");	// prints * i times in a row
			  }
			   
			  System.out.printf("%n");		// prints a new line after a row
		  }
	
	}

}
