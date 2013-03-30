


public class PolarCoordinates {
public static void main (String[] args){
double x,y;
	
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
	
	
double r = Math.sqrt(x*x+y*y);
double t = Math.atan2(y, x);
System.out.println(r);
System.out.print(t);
}
}
