
public class test_birtday_calclation 
{
	public static void main(String[] args)
	{
		final int Class = 20;
		final int trial = 1000;
		int birthday_match = 0;
		
		for (int i = 0; i < trial; i++)
		{
			if (birthday_calclation.matching_birthdays(Class))
			{
				birthday_match= birthday_match+1;
			}
		}
		double probability = ((double)birthday_match / trial) * 100;
		System.out.printf("Class size: %d %n", Class);
		System.out.printf("Number of trials run: %d %n", trial);
		System.out.printf("The probability of two people having the same birthday: %.2f%% %n", probability);
	}

}
