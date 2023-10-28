import java.math.BigInteger;
import java.util.ArrayList;

/*
 * this class holds the formulas for chapter 2
 * had help from Hope
 * @author heather krencicki
 */
public class Stats_library_Ch2 
{
	public double findintersection(ArrayList<Double> userinputnum1, ArrayList<Double> userinputnum2) 
	{
		double sum_of_arrylist_1 = 0.0;
		double sum_of_arrylist_2 = 0.0;
		if (userinputnum1 == null || userinputnum2 == null) 
	    {
	        return 0.0;
	    }
	    for (Double num : userinputnum1) {
	        sum_of_arrylist_1 += num;
	    }
	    
	    for (Double num : userinputnum2) {
	        sum_of_arrylist_2 += num;
	    }
	    
	    double intersect = Math.min(sum_of_arrylist_1, sum_of_arrylist_2);
	    return intersect / userinputnum1.size();
	}
	
	public ArrayList<Double> findunion(ArrayList<Double> userinputnum1,int elementfor1, ArrayList<Double> userinputnum2,int elementfor2)
	{
		ArrayList<Double> placeholder = new ArrayList<Double>();
		
		//for(int i = 0; i < elementfor1; i++)
		//{
			//placeholder.add(userinputnum1[i]);
		//}
		//for(int i = 0; i < elementfor2; i++)
		//{
			//placeholder.add(userinputnum2[i]);
		//}
		return placeholder;
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
}
