package stats_library_continued;
/*
 * has all formulas for chapter 4 and 5 that were able to be completed with out calc
 * 
 * had help from hope 
 * @author heather krencicki
 */
public class Stats_libreary_Ch4_5 
{
	//Chapter 4
	public static double continuousPD(double x, double a, double b) 
    {
		if (x < a || x > b) 
        {
			return 0;
        }
		return 1.0 / (b - a);
    }

	public static double continuousCD(double x, double a, double b) 
    {
		if (x < a) 
        {
			return 0;
        } 
		else if (x > b) 
        {
			return 1;
        } 
		else 
        {
			return (x - a) / (b - a);
        }
    }

	public static double discretePD(int n) 
    {
		return 1.0 / n;
    }

    public static double discreteCD(int x, int n) 
    {
    	if (x < 1) 
        {
    		return 0;
        } 
    	else if (x > n) 
        {
           	return 1;
        } 
    	else 
        {
    		return (double) x / n;
        }
    }

    public static double ContinuousRandom(double a, double b) 
    {
    	return a + Math.random() * (b - a);
    }

    
    public static int DiscreteRandom(int n) 
    {
        
    	return (int) (Math.random() * n) + 1;
    }
    
    //Chapter5
	public static double conditionalProbability(double probabilityA, double probabilityAandB) 
	{
        
		if (probabilityA == 0) 
        {
			throw new IllegalArgumentException("Probability of A must be greater than 0");
        }
		return probabilityAandB / probabilityA;
    }

}
