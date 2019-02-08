// Name: Bryce Gramling		 
// Date:2/8/19

	/*
	This program converts Celsius into Fahrenheit and vice-versa.
	Arguments are temperature and the system of measurement (F or C)
	Output is a statement about the converted temperature.
	Ex. java tempconverter 32 F
	The temperature in Celsius is 0.0 C.
	*/

public class tempconverter_temp{
   public static void main(String[] args){
	   
	double t = Double.parseDouble(args[0]);
	String choice = args[1];
	double tempconvert;
	
	//Hint: To convert from F to C use Degrees F = 9.0/5.0 * C + 32
	//                                         C = 5.0/9.0 * (F - 32)

	if( choice.equals("C")) {
		tempconvert = 9.0/5.0* t+32;
		System.out.printf("That temperature in F is %.1f °F %n",tempconvert);
	}
	else{
		if (choice.equals("F")) {
			tempconvert = 5.0/9.0*(t-32);
			System.out.printf("That temperature in C is %.f °C %n",tempconvert);
		}
		else{
			System.out.println("Sorry your code has an error. Please put the temperature followed by F or C");
		}
	}
   }
  
} 