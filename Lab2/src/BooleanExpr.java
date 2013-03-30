//import java.util.Scanner;


public class BooleanExpr {
public static void main(String [] args){
	boolean a,b;
	
		a = Boolean.parseBoolean(args[0]);
		b = Boolean.parseBoolean(args[1]);
		
	boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));
	System.out.print("a: " + a);
	//System.out.print(a);
	System.out.print("\nb: " + b);
	//System.out.print(b);
	System.out.println("\nphi: " + phi);
}
}
