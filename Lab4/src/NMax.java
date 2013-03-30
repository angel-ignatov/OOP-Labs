
public class NMax {

	public static int max(int a, int b, int c){
		return Math.max(Math.max(a,b),c);	
	}
	
	
	public static double max(double a, double b, double c){
		return Math.max(Math.max(a,b),c);	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers, seperated with a space: ");
		int N = 3;
	    double[] input = new double[N];
	    for (int i = 0; i < N; i++) {
	        input[i] = StdIn.readInt();
	    }
	    double a = input[0], b = input[1], c = input[2];
	    System.out.println(max(a, b, c));

	}
	

}
