import java.math.BigInteger;
import java.util.ArrayList;

public class Stats_library_Ch2 
{
	public double findintersection(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	
	public double findunion(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	
	public double find_idependent_and_dependent_intersection(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	
	public double find_exclusive_or_not_excclusive_union(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	public static BigInteger findCombination(int n, int r)
	{
		//Check for invalid input: n < 0, r < 0, or r > n
		if (n < 0 || r < 0 || r > n)
		{
			//Return BigInteger.ZERO for invalid input
			return BigInteger.ZERO;
		}
		//Calculate the number as n!
		BigInteger num = factorial(BigInteger.valueOf(n));
		//Calculate the denominator as r! * (n - r)!
		BigInteger denom = factorial(BigInteger.valueOf(r)).multiply(factorial(BigInteger.valueOf(n - r)));
		
		//Return the result of n! / (r! * (n - r)!)
		//Return the result of numerator divided by denominator
		return num.divide(denom);
	}
	
	//Method to calculate premutations using BigInteger
	public static BigInteger findPremutation(int n, int r)
	{
		//Check for invalid input: n < 0, r < 0, or r > n
		if (n < 0 || r < 0 || r > n)
		{
			//Return BigInteger.ZERO for invalid input
			return BigInteger.ZERO;
		}	
		//Calculate the result as n! / (n - r)!
		BigInteger result = factorial(BigInteger.valueOf(n)).divide(factorial(BigInteger.valueOf(n - r)));
		
		//Return the premutation result
		return result;
	}	
	//Method to calculate the factorial using BigInteger
		public static BigInteger factorial(BigInteger n)
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
}
