public class ArithmeticSeries {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(args[0]);
		int s = 0;
		int i = 0;
		while (i <=n) s+=i++;
		System.out.println(s);
	

	}

}
