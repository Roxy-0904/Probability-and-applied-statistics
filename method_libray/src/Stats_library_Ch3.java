import java.util.Random;
import java.lang.Math;

public class Stats_library_Ch3 extends Stats_library_Ch2

{
	public double find_Binomial_probaility(double p, int n, int y )
	{
		double q = 1-p;
		double result = findCombination(n,y).doubleValue() * Math.pow(p, y) * Math.pow(q, (n-y));
		
	return result;
	}
	public double find_geometric_probaility(double p, int y )
	{
		double q = 1-p;
		double result = Math.pow(p, y-1) * q;
		
	return result;
	}
	
	/*public double find_hypergeometric_probaility(Random r, int N, int n, int y )
	{
		int numerator = 0  ;
		int denominator = 0;
		for i = 1; 
			{
					
			}
		double result = numerator/denominator;
		
	return result;
	}*/
	
	/*public double find_negative_binomial_probaility(double n, double p )
	{
		int numerator = 0  ;
		int denominator = 0;
		for i = 1; 
			{
					
			}
		double result = numerator/denominator;
		
	return result;
	}*/

}
