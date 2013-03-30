import java.util.Scanner;


public class SquaresLoopRange {
public static void main (String[] args){
int start, end;
	
	if ( args.length != 0 )
	{
		start = Integer.parseInt(args[0]);
		end = Integer.parseInt(args[1]);
		
	}
	else
	{
		Scanner sc = new Scanner( System.in );
		start = sc.nextInt();
		end = sc.nextInt();
	}
	if (start<=end) {
	for (int i = start; i<=end; i++){
		System.out.print(i*i + " ");
	}
	System.out.print("\n");
	}
	else System.out.println("Start-limit greater than stop-limit!");
}
}
