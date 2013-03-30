import java.util.Scanner;


public class SaferDivider {
	public static void main (String[] args){
	double numerator, denominator;
	
	if ( args.length != 0 )
	{
		numerator = Double.parseDouble(args[0]);
		denominator = Double.parseDouble(args[1]);
	}
	else
	{
		Scanner sc = new Scanner( System.in );
		numerator = sc.nextDouble();
		denominator = sc.nextDouble();
	}
	if (denominator != 0) System.out.println(numerator/denominator);
	else System.out.println("I can't divide by zero!");
}
}
