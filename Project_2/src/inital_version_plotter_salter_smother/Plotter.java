package inital_version_plotter_salter_smother;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Plotter
 * in this program you are are take a function that is inside of the function class
 * then in the method plotter of graph it takes in the low and upper limits 
 * for the range of values and takes in how many points you want to get then as the function goes through it with 
 * call the function method so that it can do math on the functiction until it has hit the last point for the points need then will print
 * out saying that plotting is complete.
 * 
 * @author Heather Krencicki
 * */
public class Plotter 
{
	public static int function(int x)
	{
		int y = (int) (2*Math.pow(x, 2)+5*x-10);
		return y;
	}
	
	public void plotterOfgraph(int lowlimit, int upperlimit, int points)
	{
		
		try (FileWriter writer = new FileWriter("Function_points.csv");
	             BufferedWriter Creater = new BufferedWriter(writer))
			{
				Creater.write("x" + "," + "y");
				Creater.newLine();
				for(int i = 0; i <= points; i++)
				{		
					int x = lowlimit + i;
					int function = function(x);
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
