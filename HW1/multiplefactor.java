//Homework 1

public class multiplefactor {
    public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
		
		int M1 = n1 % n2;     // variable to determine if first number is multiple of second
		int M2 = n2 % n1;	  // variable to determine if first number is factor of the first
		int s1 = n1*n1;			//square of first number
		int s2 = n2*n2;			//square of second number
		int e1 = n1%2;			//variable to determine even or odd
		int e2 = n2%2;			//variable to determine even or odd
		
		if(M1==0){														// Used to print out if a number if multiple or factor of the other
			System.out.println(n1 +" is a multiple of " +n2);
		}
		else{
			
			if(M2==0){
			System.out.println(n1 +" is a factor of " +n2);	
			}
			else{
				System.out.println(n1 +" is NOT a multiple or factor of " +n2);
			}
		}
		
		
		if(e1==0){															// Used to determine if first number is even or odd and print square
			System.out.println(n1+" is even and " +n1+" squared is " +s1);
		}
		else{
			System.out.println(n1+" is odd and " +n1+" squared is " +s1);
		}
		
		if(e2==0){															// Used to determine if second number is even or od and print square
			System.out.println(n2+" is even and " +n2+" squared is " +s2);
		}
		else{
			System.out.println(n2+" is odd and " +n2+" squared is " +s2);
		}
		
	
	}
}	