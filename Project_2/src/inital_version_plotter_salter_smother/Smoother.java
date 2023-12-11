package inital_version_plotter_salter_smother;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*Smoother
 * For this program the method smooth data reads in the points in the function points salted csv and separates them and 
 * reads in the x and y values and adds the y values to an array list. Then you take an index which is made from the x values - 1
 * then uses that to make the left and right bounds. After there is a for and a if look inside that checks to see if the value of i 
 * is i >= left bound or i <= right bound if that rule is meant it will at the values in the array to the sum variable and then increases
 * the sum points by 1. when outside the loop it takes the average of sum and sum points then writes it to the file, creates a new line 
 * and outside of the if loop it increases the line count by 1 and once it reaches the last line it will print out smoothing is complete.
 * 
 * used as reference https://github.com/ilindaa/Project-1/blob/main/Project1/src/GraphProgram/GraphProgram.java
 * 
 * @author Heather Krencicki
 */

public class Smoother 
{
	
	public void smoothData(String filename,int windowValue_x, int windowValue_y) 
	{
		BufferedReader objReader = null;
		FileWriter writer = null;
		BufferedWriter Creater = null;
		int linenum = 0;
		ArrayList<Integer> yData = new ArrayList<Integer>();
		try 
		{
			objReader = new BufferedReader(new FileReader(filename));
			writer = new FileWriter("Function_points_smoothed.csv");
			Creater = new BufferedWriter(writer);
			String strLine = "";
			while ((strLine = objReader.readLine()) != null) 
			{
				if (linenum == 0)
				{
					String firstline = ("x" + "," + "y");
					Creater.write(firstline);
					Creater.newLine();
					
					
				}
				else
				{
					String[] values = strLine.split(",");
					int x_values = Integer.parseInt(values[0]);
					int y_values = Integer.parseInt(values[1]);
					yData.add(y_values);
					
					int index = (x_values - 1);
					int sum = 0;
					double avarage;
					int lbound = index - windowValue_y;
					int rbound = index - windowValue_x;
					int sumpoints = 0;
					for(int i = 0; i < yData.size(); i++)
					{
						if(i >= lbound || i <= rbound)
						{
							sum = sum + yData.get(i);
							sumpoints = sumpoints+1;
						}
					}
					
					avarage = sum/sumpoints;
					String s2 = (values[0] + "," + avarage);
					Creater.write(s2);
					Creater.newLine();
					Creater.flush();
				}
				linenum = linenum + 1; 
			}
			System.out.println("Smoothing is complete");
		} 
		catch (IOException e) 
		{
			   e.printStackTrace();
		} 
		finally 
		{
			   try 
			   {
			    if (objReader != null)
			    	
			    	objReader.close();
			    	writer.close();
			   } 
			   catch (IOException ex) 
			   {
			    ex.printStackTrace();
			   }
		}
		
	}
}
