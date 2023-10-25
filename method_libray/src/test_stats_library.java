import java.math.BigInteger;
import java.util.ArrayList;

public class test_stats_library 
{
	public static void main(String[] args)
	{
	Stats_library_Ch1 test_ch1 = new Stats_library_Ch1();
	Stats_library_Ch2 test_ch2 = new Stats_library_Ch2();
	Stats_library_Ch3 test_ch3 = new Stats_library_Ch3();
	ArrayList<Double> testnums1 = new ArrayList<Double>();
	ArrayList<Double> testnums2 = new ArrayList<Double>();
	testnums1.add(1.0); testnums2.add(8.0);  
	testnums1.add(2.0); testnums2.add(2.0);
	testnums1.add(3.0); testnums2.add(4.0);
	testnums1.add(4.0); testnums2.add(6.0);
	testnums1.add(5.0); testnums2.add(5.0);
	testnums1.add(6.0); testnums2.add(7.0);
	testnums1.add(7.0); testnums2.add(9.0);
	testnums1.add(5.0); testnums2.add(5.0);
	 
	double testmean = test_ch1.findmean(testnums1);
	double testmedian = test_ch1.findmedian(testnums1);
	double testmode = test_ch1.findmode(testnums1);
	double testStandardDeviation = test_ch1.findStandardDeviation(testnums1);
	double testintersection = test_ch2.findintersection(testnums1,testnums2);
	BigInteger testCombination =test_ch2.findCombination(3,6);
	BigInteger testPremutation = test_ch2.findPremutation(3, 6);
	BigInteger testfactorial = test_ch2.factorial(BigInteger.valueOf(7));
	
	//double test__hypergeometric_probaility = test_ch3.find_hypergeometric_probaility();
	
	System.out.println("This is the average of testnums1: " + testmean);
	System.out.println("This is the median of testnums1: " + testmedian);
	System.out.println("This is the mode of testnums1: " + testmode);
	System.out.println("This is the Standard Deviation of testnums1: " + testStandardDeviation);
	System.out.println("This is the intersection for testnums 1 and testnums2: " + testintersection);
	System.out.println("This is the test for factorial: " + testfactorial);
	System.out.println("This is the test for Combination " + testCombination);
	System.out.println("This is the test for Premutation: " + testPremutation);
	//System.out.println("This is the Standard Deviation of testnums: " + test__hypergeometric_probaility);
	}


}
