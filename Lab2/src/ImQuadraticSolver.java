//import java.util.Scanner;


public class ImQuadraticSolver {
public static void main (String[] args) {
	double a,b,c;
	
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
		
	double d = b*b-4*a*c, ds = Math.sqrt(Math.abs(d));
	double x1, x2;
	if (a != 0){
	if (d >= 0) {
			x1 = (-1*b + ds)/(2*a);
			x2 = (-1*b - ds)/(2*a);
		System.out.println(x1);
		System.out.println(x2);
		}
	else {
		x1 = (-1)*b/(2*a) + ds/(2*a);
		x2 = (-1)*b/(2*a) - ds/(2*a);
		System.out.println(x1 + "i");
		System.out.println(x2 + "i");
	}
	}
	else System.out.println(-c/b);
}
}
