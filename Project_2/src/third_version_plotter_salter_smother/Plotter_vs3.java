package third_version_plotter_salter_smother;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plotter_vs3 
{
	public static double function(double x)
	{
		double y = 2*Math.pow(x, 2)+5*x-10;
		return y;
	}
	
	public void plotterOfgraph(int lowlimit, int upperlimit, int points)
	{
		
		try (FileWriter writer = new FileWriter("Function_points.csv");
	             BufferedWriter Creater = new BufferedWriter(writer))
			{
				Creater.write("X,Y");
				Creater.newLine();
				for(int i = 0; i <= points; i++)
				{		
					double x = lowlimit + i;
					double function = function(x);
					Creater.write(x + "," + function);
					Creater.newLine();
				}
				System.out.println("Plot is compleate");
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
	}
}
