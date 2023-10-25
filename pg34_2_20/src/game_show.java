import java.util.Random;

public class game_show 
{
	
	public static  void game_door_not_changed(int trials)
	{
		Random n = new Random();
		int wining = 0;
		double probablity = 0.0;
		for (int i = 1; i <= trials; i++)
		{
			int prize_door = n.nextInt(3)+1;// option of choosing form 3 doors;
			int ChossenDoor = n.nextInt(3)+1;// player chose one of three doors
			// if the player chooses the winning door increase the number of wins by one
			if (ChossenDoor == prize_door)
			{
				wining++;
			}
			probablity = (wining / trials) * 100;
		}
		System.out.println ("The total number of wins out of " + trials + " games would be " + wining);
		System.out.println ("Thus making the percentage of wins " + probablity + "%");
		System.out.println();
	}
	

	public static void game_door_changed(int trials)
	{
		Random n = new Random();
		int wining = 0;
		double probablity = 0.0;
		for (int i = 1; i <= trials; i++);
		{
			int prize_door = n.nextInt(3)+1;// option of choosing form 3 doors
			int dud = prize_door;
			int ChossenDoor = n.nextInt(3)+1;// player chose one of three doors
			while (dud == prize_door || dud == ChossenDoor)
		    {
				dud = n.nextInt(2)+1;
		    }
			int changeDoor = 2 - ChossenDoor;
			if (changeDoor == prize_door)
			{
				wining++;
			}
			probablity = ((double) wining / trials) * 100;
		}
		System.out.println ("The total number of wins out of " + trials + " games would be " + wining);
		System.out.println ("Thus making the percentage of wins " + probablity+ "%");
		System.out.println();
	}

}
