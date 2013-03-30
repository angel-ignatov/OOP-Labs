//import java.util.Scanner;

public class MultiplesLoopRange {
	public static void main (String[] args){
		int start, end, m;
		start = Integer.parseInt(args[0]);
		end = Integer.parseInt(args[1]);
		m = Integer.parseInt(args[2]);

		if (start<=end) {
			for (int i = start; i<=end; i++){
				if (i % m == 0) System.out.print(i + " ");
			}
		}
		else {
			for (int i = start; i>=end; i--){
				if (i % m == 0) System.out.print(i + " ");
			}
		}
	}
}
