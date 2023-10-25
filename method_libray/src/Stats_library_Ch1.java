import java.util.ArrayList;

public class Stats_library_Ch1 
{
	public double findmean(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	for(double singleElement : userinputnum)
	{
	sum = sum + singleElement;
	}
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	
	public double findmedian(ArrayList<Double> userinputnum)
	{
	double sum = userinputnum.size();
	sum = sum+1;
	//storing a value for clarity
	double result = sum / 2;
	return result;
	}
	
	public double findmode(ArrayList<Double> userinputnum)
	{
        Double maxValue = 0.0;
		int maxCount = 0;

        for (int i = 0; i < userinputnum.size(); ++i) 
        {
            int count = 0;
            for (int j = 0; j < userinputnum.size(); ++j) 
            {
                if (userinputnum.get(j) == userinputnum.get(i))
                {
                	++count;
                }    
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = userinputnum.get(i);
            }
        }
        return maxValue;
	
	}
	
	public double findStandardDeviation(ArrayList<Double> userinputnum)
	{
		double sum = 0.0;
        double sumOfSquares = 0.0;

        for (double num : userinputnum) 
        {
        	sum += num;
            sumOfSquares += Math.pow(num, 2);
        }
        double mean = sum / userinputnum.size();
        double variance = sumOfSquares / userinputnum.size() - Math.pow(mean, 2);
        double stdDev = Math.sqrt(variance);
        return stdDev;
	}


}
