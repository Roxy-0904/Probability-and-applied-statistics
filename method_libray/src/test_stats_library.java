import java.util.ArrayList;

public class test_stats_library 
{
	public static void main(String[] args)
	{
	stats_library test = new stats_library();
	ArrayList<Double> testnums = new ArrayList<Double>();
	testnums.add(1.0);
	testnums.add(2.0);
	testnums.add(3.0);
	testnums.add(4.0);
	testnums.add(5.0);
	testnums.add(6.0);
	testnums.add(7.0);
	double testmean = test.findmean(testnums);
	double testmedian = test.findmedian(testnums);
	double testmode = test.findmode(testnums);
	double testStandardDeviation = test.findStandardDeviation(testnums);
	
	System.out.println("This is the average of testnums: " + testmean);
	System.out.println("This is the median of testnums: " + testmedian);
	System.out.println("This is the mode of testnums: " + testmode);
	System.out.println("This is the Standard Deviation of testnums: " + testStandardDeviation);
	}


}
