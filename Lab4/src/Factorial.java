public class Factorial {
   public static int factorial(int N) {
      int f = 1;
	   for(int i=1; i<=N; i++)
    	  f  =f*i;
	   return f;
    }

    public static void main(String[] args) {
        System.out.println(" 2! (Should be: 2) returned: " + factorial(2) );
        System.out.println(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.println(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}