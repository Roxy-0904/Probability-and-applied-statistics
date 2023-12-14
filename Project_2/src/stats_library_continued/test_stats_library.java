package stats_library_continued;



/*
 *This class is used to test all of the formulas that are in the chapter 4 and 5 class.
 * @author heather krencicki
 */
public class test_stats_library 
{
	public static void main(String[] args)
	{
		int n = 10; 
		int xDiscrete = 5; 
		double a = 0, b = 5; 
		double xContinuous = 2.5;
		double probabilityA = 0.3; 
		double probabilityAandB = 0.1;
		System.out.println("Chapter 4:" );
		System.out.println("Continuous Uniform Distribution:");
		System.out.println("PDF at " + xContinuous + ": " + Stats_libreary_Ch4_5.continuousPDF(xContinuous, a, b));
		System.out.println("CDF at " + xContinuous + ": " + Stats_libreary_Ch4_5.continuousCDF(xContinuous, a, b));
		System.out.println("Random number: " + Stats_libreary_Ch4_5.generateContinuousRandom(a, b));
		System.out.println("\nDiscrete Uniform Distribution:");
		System.out.println("PDF: " + Stats_libreary_Ch4_5.discretePDF(n));
		System.out.println("CDF at " + xDiscrete + ": " + Stats_libreary_Ch4_5.discreteCDF(xDiscrete, n));
		System.out.println("Random number: " + Stats_libreary_Ch4_5.generateDiscreteRandom(n));
		System.out.println("Chapter 5:" );
		System.out.println("\nConditional Probability:");
		System.out.println("Conditional probability of B given A: " + Stats_libreary_Ch4_5.conditionalProbability(probabilityA, probabilityAandB));	 
	
	}


}
