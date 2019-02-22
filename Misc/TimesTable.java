public class TimesTable
{
   // start main method
   public static void main(String[] args)
   {
	   for (int j = 1; j < 11; j++)
	   {
		   for (int i = 1; i < 11; i++)
		   {
			   System.out.printf("%d\t", i*j); //prints a multiplication row
		   }
		   System.out.printf("%n");		// prints a new line after a row;
	   }
   }
}