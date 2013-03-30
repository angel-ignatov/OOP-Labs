
public class MeanVariance {

	public static void main(String[] args) {
		double mean, variance;
		double array[] = new double[args.length];
		
			for (int i = 0; i<args.length; i++)
				array[i] = Double.parseDouble(args[i]);
		
		
		
		double s = 0;
		for (int i = 0; i<array.length; i++) {
			s = s + array[i];
		}
		mean = s/args.length;
		double x =0;
		for (int i = 0; i<args.length; i++)
		{
			x += (array[i]-mean)*(array[i]-mean);
		}
		variance = x/args.length;
		System.out.println(mean + "\n" + variance);
	}
}