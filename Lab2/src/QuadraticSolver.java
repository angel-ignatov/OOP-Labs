import java.util.Scanner;


public class QuadraticSolver {
public static void main (String[] args){
	double a,b,c;
	
	if ( args.length != 0 )
	{
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
	}
	else
	{
		Scanner sc = new Scanner( System.in );
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
	}
double d = b*b-4*a*c, ds = Math.sqrt(d);	
	if (ds >= 0) {
		double x1 = (-1*b + ds)/(2*a);
		double x2 = (-1*b - ds)/(2*a);
	System.out.println(x1);
	System.out.println(x2);
	}
}
}
