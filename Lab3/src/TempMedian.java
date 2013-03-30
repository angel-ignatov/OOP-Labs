import java.util.Arrays;

public class TempMedian {
	public static void main(String[] args) {

		int tempr[] = new int[args.length];
		tempr[0] = Integer.parseInt(args[0]);
		for (int i = 1; i<args.length; i++)
		{
			if (args[i].equals(".")) tempr[i] = tempr[i-1];
			else 
				if (args[i].equals("+")) tempr[i] = tempr[i-1]+1;
				else
					if(args[i].equals("-")) tempr[i] = tempr[i-1]-1;
		}
		for (int i = 0; i<args.length; i++) System.out.print(tempr[i] + " ");
		System.out.println("");
		Arrays.sort(tempr);

		for (int i = 0; i<args.length; i++) System.out.print(tempr[i] + " ");
		System.out.println("");

		double med;
		if (tempr.length % 2 == 0) med = (double)(tempr[tempr.length/2-1] + tempr[tempr.length/2])/2;
		else med = tempr[tempr.length/2];
		System.out.println(med);

	}

}
