import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 * This run trials to check the class size to find people that have the same birthday.
 * There is also a class that helps print out the numbers we found in the other methods.
 * 
 * used https://www.youtube.com/watch?v=TKOC68nc_tM as reference material.
 * @author heather krencicki
 */

public class birthday_calclation 
{
	private Random n = new Random();
	private final int days_in_a_year = 365;
	public void birthday_trial_checks(int classsize, int trials)
	{
		int success = 0;
		for (int i = 0; i < trials; i++)
		{
			ArrayList<Integer> listofbdays = getbirthday(classsize);
			if(foundmatchs(listofbdays))
			{
				success++;
			}
			
		}
		printstats(classsize,success,trials);
	}
	
	
	private ArrayList<Integer> getbirthday(int classsize) 
	{
		ArrayList<Integer> bdays = new ArrayList<>();
		
		for(int i = 0; i < classsize; i++)
		{
			bdays.add(n.nextInt(days_in_a_year)+1);
		}
		
		return bdays;
	}
	
	private boolean foundmatchs(ArrayList<Integer> listofbdays) 
	{ 
		return !listofbdays.stream().allMatch(new HashSet<>()::add);
	}
	
	private void printstats(int classsize,int success, int trials) {
		System.out.printf("Class size: %d %n", classsize);
		System.out.printf("Number of trials run: %d %n", trials);
		System.out.println("The probability of two people having the same birthday: " + (success * 100.0f) / trials);
		
	}

}
