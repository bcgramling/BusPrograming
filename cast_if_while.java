public class cast_if_while {
    public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);
	int y = Integer.parseInt(args[1]);
	
	
	//This is the casting part of the code:
	System.out.println(x*y);
	System.out.println((int)(Math.pow(x,y)));
	System.out.printf("If we want to represent as integer need to cast %f * %d = %d%n",x,y,(int)x*y);
	
	//This is the if/else if/else part of the code:
	if (y > 99 && y < 1000)
	{
		System.out.println("y is a 3-digit number.");
	}
	else if (y > 9 && y <1000)
	{
		System.out.println("y is a 2-digit number.");
	}
	else if (y > 0 && y <1000)
	{
		System.out.println("y is a 1-digit number.");
	}
	else
	{
		System.out.println("y is a negative number or greater than 1000.");
	}
	
	//This is the while loop
	while (x > 0)
	{
		System.out.println("x is " + x);
		x--;
		//Let's say you want to increase
		y = y * 2;

	}
	System.out.println("y is " + y);
	
}
}