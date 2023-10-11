import java.util.ArrayList;

public class test_stats_library 
{
	public static void main(String[] args)
	{
	Stats_library_Ch1 test_ch1 = new Stats_library_Ch1();
	Stats_library_Ch2 test_ch2 = new Stats_library_Ch2();
	Stats_library_Ch3 test_ch3 = new Stats_library_Ch3();
	ArrayList<Double> testnums = new ArrayList<Double>();
	testnums.add(1.0);
	testnums.add(2.0);
	testnums.add(3.0);
	testnums.add(4.0);
	testnums.add(5.0);
	testnums.add(6.0);
	testnums.add(7.0);
	testnums.add(5.0);
	double testmean = test_ch1.findmean(testnums);
	double testmedian = test_ch1.findmedian(testnums);
	double testmode = test_ch1.findmode(testnums);
	double testStandardDeviation = test_ch1.findStandardDeviation(testnums);
	
	//double test__hypergeometric_probaility = test_ch3.find_hypergeometric_probaility();
	
	System.out.println("This is the average of testnums: " + testmean);
	System.out.println("This is the median of testnums: " + testmedian);
	System.out.println("This is the mode of testnums: " + testmode);
	System.out.println("This is the Standard Deviation of testnums: " + testStandardDeviation);
	
	//System.out.println("This is the Standard Deviation of testnums: " + test__hypergeometric_probaility);
	}


}
