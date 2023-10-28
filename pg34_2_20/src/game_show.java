import java.util.Random;

/*
 * In this class we have the method to complete the monty hall problem.
 * In that method it takes in the number of trials from the test class
 * and creates a situation to test to see if some one has chosen 
 * the right door out of 3 doors to win a prize for that many trials.
 * 
 * I used https://www.javaprogrammingforums.com/blogs/copeg/13-monty-hall-problem.html for reference 
 * and help with this program.
 * 
 * @author heather krencicki
 */
public class game_show 
{
	
	private static double stayprobability  = 0;
	private static double changeprobability = 0;
	private static int stayCount = 0;
	private static int changeCount = 0;
	public void Montyhall(int trials)
	{
	Random n = new Random();
	for ( int i = 0; i < trials; i++ ){
		int player_door = n.nextInt(3);//choose a door at random
		int prize_door = n.nextInt(3);//find a random place where the car will be.
		if ( prize_door != player_door ){//Car is in the other door - if you change you win
			changeCount++;
		}else{//If you stay you win.
			stayCount++;
		}
	}
	stayprobability = (stayCount/(double)trials) * 100;
	changeprobability  = (changeCount/(double)trials) * 100;
	}
	
	public static int getStayCount() 
	{
		return stayCount;
	}

	public static int getChangeCount() 
	{
		return changeCount;
	}

	/**
	 * Retrieves the probability one will be correct if one stays. This method returns
	 * zero unless run has been called. 
	 * @return stayprobability;
	 * */
	public double getStayprobobility(){
	return stayprobability;
	}
	/**
	 * Retrieves the probability one will be correct if one changes.  This method returns
	 * zero unless run has been called. 
	 * @return changeprobability;
	 * */
	public double getChangeprobability(){
	return changeprobability ;
	}
}