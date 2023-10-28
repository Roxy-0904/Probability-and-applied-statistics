import java.math.BigInteger;
import java.util.ArrayList;

/*
 *This class is used to test all of the formulas that are in the chapter 1,2, and 3 classes.
 * @author heather krencicki
 */
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
	System.out.println("Chapter 1:" );
	System.out.println("This is the average of testnums1: " + testmean);
	System.out.println("This is the median of testnums1: " + testmedian);
	System.out.println("This is the mode of testnums1: " + testmode);
	System.out.println("This is the Standard Deviation of testnums1: " + testStandardDeviation);
	
	double testintersection = test_ch2.findintersection(testnums1,testnums2);
	BigInteger testCombination =test_ch2.findCombination(3,6);
	BigInteger testPremutation = test_ch2.findPremutation(3, 6);
	BigInteger testfactorial = test_ch2.factorial(BigInteger.valueOf(7));
	System.out.println("Chapter 2");
	System.out.println("This is the intersection for testnums 1 and testnums2: " + testintersection);
	System.out.println("This is the test for factorial: " + testfactorial);
	System.out.println("This is the test for Combination " + testCombination);
	System.out.println("This is the test for Premutation: " + testPremutation);
	
	double test_binomial_probability = test_ch3.find_Binomial_probaility(0.8, 4, 2);
	double test_geometric_probability = test_ch3.find_geometric_probaility(0.7, 5);
	double test__hypergeometric_probability = test_ch3.find_hypergeometric_probaility(5, 20, 10, 5);
	double test_negative_binomial_probability = test_ch3.find_negative_binomial_probaility(0.4, 10, 3);
	double test_poisson_probability = test_ch3.find_poisson_probaility(2, 4);
	double test_tchebysheff_probability = test_ch3.find_tchebysheff_probaility(4);
	System.out.println("Chapter 3");
	System.out.println("This is the test for binomial probability: " + test_binomial_probability);
	System.out.println("This is the test for geometric probability: " + test_geometric_probability);
	System.out.println("This is the test for hypergeomtric probability: " + test__hypergeometric_probability);
	System.out.println("This is the test for negative binomial probability: " + test_negative_binomial_probability);
	System.out.println("This is the test for poisson probability: " + test_poisson_probability);
	System.out.println("This is the test for tchebysheff probaility: " + test_tchebysheff_probability);
	}


}
