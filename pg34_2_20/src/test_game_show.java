
public class test_game_show 
{
	public static void main(String[] args)
	{
		
		int trial = 10000;
		game_show test = new game_show();
		test.Montyhall(trial);
		System.out.println("Choose to stay: percent correct - " + test.getStayprobobility());//never changes the door selected
		System.out.println("Choose to change: percent corect - " + test.getChangeprobability());//changes the door selected
		
	}

}
