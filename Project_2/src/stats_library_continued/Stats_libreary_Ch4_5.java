package stats_library_continued;

public class Stats_libreary_Ch4_5 
{
	//Chapter 4
	public static double continuousPDF(double x, double a, double b) 
    {
		if (x < a || x > b) 
        {
			return 0;
        }
		return 1.0 / (b - a);
    }

	public static double continuousCDF(double x, double a, double b) 
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

	public static double discretePDF(int n) 
    {
		return 1.0 / n;
    }

    public static double discreteCDF(int x, int n) 
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

    public static double generateContinuousRandom(double a, double b) 
    {
    	return a + Math.random() * (b - a);
    }

    
    public static int generateDiscreteRandom(int n) 
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
