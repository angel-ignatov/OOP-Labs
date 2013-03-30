//import java.util.Scanner;

public class Gambler
{
  public static void main(String[] args)
  {
	  int stake, goal, num_trials;
	 
    stake = Integer.parseInt(args[0]);
    goal = Integer.parseInt(args[1]);
    num_trials = Integer.parseInt(args[2]);
	 
    int bets = 0;
    int wins = 0;

    for (int t = 0; t < num_trials; t++)
    {
      int cash = stake;
      while (cash > 0 && cash < goal)
      {
        bets++;
        if (Math.random() < 0.5 ) cash++;
        else                      cash--;
      }
      if (cash == goal) wins++;
    }

    System.out.println(100 * wins/num_trials + "% wins");
    System.out.println("Avg # bets: " + bets/num_trials);

  }
}