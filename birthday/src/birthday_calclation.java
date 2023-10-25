import java.util.concurrent.ThreadLocalRandom;

public class birthday_calclation 
{
	public static boolean matching_birthdays(int sample)
	{
		final int year_in_days = 365;
		boolean[] day = new boolean [year_in_days];
		for (int i = 0; i < sample;)
		{
			int j = ThreadLocalRandom.current().nextInt(day.length);
			if (day[j])
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}
