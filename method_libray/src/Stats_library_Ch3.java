import java.lang.Math;
import java.math.BigInteger;

/*
 * this class holds the formulas for chapter 3
 * @author heather krencicki
 */
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
	
	public double find_hypergeometric_probaility(int r, int N, int n, int y )
	{
		double numerator =  findCombination(r,y).doubleValue() * findCombination(N-r,n-y).doubleValue();
		double denominator = findCombination(N,n).doubleValue();
		
		double result = numerator/denominator;
		
	return result;
	}
	
	public double find_negative_binomial_probaility(double p, int y, int r )
	{
		double q = 1-p;
		double result = findCombination(y-1,r-1).doubleValue() * Math.pow(p, r) * Math.pow(q, (y-r));
		
	return result;
	}
	
	public double find_poisson_probaility(int lim,int y )
	{
		double e = 2.718;
		double numerator =   Math.pow(lim, y) * Math.pow(e, y);
		BigInteger denominator = factorial(BigInteger.valueOf(y));
		
		double result = (numerator/denominator.doubleValue());
		
	return result;
	}
	
	public double find_tchebysheff_probaility(int k )
	{
		double result = 1- 1/Math.pow(k, 2);
		
	return result;
	}
}
