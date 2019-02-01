public class boolean_test {
    public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		
		while (number >100){
			System.out.println("Your number is too big!");
			number = number - 5;
			System.out.println("Let's try this number! " +number);
		}
	
		
		if(number < 100 && number > 9)
		{
			System.out.println("Your number is positive and has 2 digits.");
		}
		else if(number < 100 && number < 10){
			System.out.println("Your number is positive and has 1 digit");
		}
		else{
			System.out.println("Your number is 0, negative or has 3 more digits.");
		}
    
	
		
		
		
	}
}