
public class LargestDouble {
public static void main (String args[]){
	double a = Double.parseDouble(args[0]),
		   b = Double.parseDouble(args[1]);
	double c = Math.max(a, b);
	System.out.println(c);
}
}
