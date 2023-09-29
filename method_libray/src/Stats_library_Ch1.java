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
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}
	
	public double findStandardDeviation(ArrayList<Double> userinputnum)
	{
	double sum = 0;
	
	//storing a value for clarity
	double result = sum / userinputnum.size();
	return result;
	}


}
