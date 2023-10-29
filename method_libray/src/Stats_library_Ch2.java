import java.math.BigInteger;
import java.util.ArrayList;

/*
 * this class holds the formulas for chapter 2
 * had help from Hope
 * @author heather krencicki
 */
public class Stats_library_Ch2 
{
	public ArrayList<Double> findintersection(ArrayList<Double> userinputnum1, ArrayList<Double> userinputnum2) 
	{
		userinputnum1.retainAll(userinputnum2);
		return userinputnum1;
	}
	
	public ArrayList<Double> findunion(ArrayList<Double> userinputnum1, ArrayList<Double> userinputnum2)
	{
		ArrayList<Double> placeholder = new ArrayList<Double>();
		placeholder.addAll(userinputnum1);
		placeholder.addAll(userinputnum2);
		return placeholder;
	}
	
	public ArrayList<Double> findcomplent(ArrayList<Double> userinputnum1, ArrayList<Double> userinputnum2)
	{
		ArrayList<Double> placeholder = new ArrayList<Double>();
		placeholder = findunion(userinputnum1,userinputnum2);
		placeholder.removeAll(findintersection(userinputnum1,userinputnum2));
		return placeholder;
	}
	
	
	
	public BigInteger findCombination(int n, int r)
	{
		
		BigInteger num = factorial(BigInteger.valueOf(n));
		//Calculate the denominator as r! * (n - r)!
		BigInteger denom = factorial(BigInteger.valueOf(r)).multiply(factorial(BigInteger.valueOf(n - r)));
		
		//Return the result of n! / (r! * (n - r)!)
		//Return the result of numerator divided by denominator
		return num.divide(denom);
	}
	
	//Method to calculate premutations using BigInteger
	public BigInteger findPremutation(int n, int r)
	{
			
		//Calculate the result as n! / (n - r)!
		BigInteger result = factorial(BigInteger.valueOf(n)).divide(factorial(BigInteger.valueOf(n - r)));
		
		//Return the premutation result
		return result;
	}	
	//Method to calculate the factorial using BigInteger
	public BigInteger factorial(BigInteger n)
	{
		//Base case: 0! = 1
		if (n.equals(BigInteger.ZERO))
		{
			return BigInteger.ONE;
		}
			
		//Initialize the result to 1
		BigInteger result = BigInteger.ONE;
			
		//Calculate factorial using a loop
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE))
		{
			//Multiply result by each integer form 1 to n
			result = result.multiply(i);
		}
			
		//Return the factorial result
		return result;
	}
	public double Conditional(double anb,double b)
	{
		//storing a value for clarity
		double result = anb / b;
		return result;
	}
	
	public double Bayes (double abj, double abj_com, double b, double b_com)
	{	
		//storing a value for clarity
		double result = (abj * b) / ((abj * b) + (abj_com * b_com)) ;
		return result;
	}
	
	public boolean Determining_Independence (double anb,double a,double b)
	{
		if (a == Conditional(anb,b)|| b == Conditional(anb,a)|| anb ==a*b)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
