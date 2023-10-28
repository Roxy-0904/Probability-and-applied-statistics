import java.util.Scanner;

/*
 * Tests the methods from birthday_calclation
 * and takes in the class size and the number of trials from the user.
 * 
 * @author heather krencick
 */
public class test_birtday_calclation 
{
	public static void main(String[] args)
	{
		birthday_calclation bdp = new birthday_calclation();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the class size you want to test: ");
		int class_size = input.nextInt();
		System.out.println("Enter the number of trials you want to run: ");
		int trials = input.nextInt();
		
		for (int i = 0; i < 10; i++)
		{
			bdp.birthday_trial_checks(class_size, trials);
		}
	}

}
