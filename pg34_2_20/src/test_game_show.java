
public class test_game_show 
{
	public static void main(String[] args)
	{
		
		int trial = 10000;
		
		//never changes the door selected
		System.out.println("The player never changes the door selected.");
		game_show.game_door_not_changed(trial);
		
		//changes the door selected
		System.out.println("The player changes the door selected.");
		game_show.game_door_changed(trial);
		
	}

}
