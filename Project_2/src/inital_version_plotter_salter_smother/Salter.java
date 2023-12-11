package inital_version_plotter_salter_smother;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*Salter
 * For this program the method salted values reads in the points in the function points csv and separates them and 
 * reads in the y values and add it to the random salt value that is created from the min salt value and max salt 
 * value and divided by 2 it then takes that number and writes in to the function points salted csv until it has 
 * gone through all and then prints out salting is complete
 * 
 * used as reference https://github.com/ilindaa/Project-1/blob/main/Project1/src/GraphProgram/GraphProgram.java
 * 
 * @author Heather Krencicki
 */
public class Salter 
{
	int linenum = 0;
	private static final Random n = new Random();
	public void  saltedvalues(String filename,int minsaltvalue, int maxsaltvalue)
	{
	 
		
		BufferedReader objReader = null;
		FileWriter writer = null;
		BufferedWriter Creater = null;
		try 
		{
			objReader = new BufferedReader(new FileReader(filename));
			writer = new FileWriter("Function_points_salted.csv");
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
					int randomNumber = n.nextInt(maxsaltvalue - minsaltvalue / 2);
					int old_y_values = Integer.parseInt(values[1]);
					int new_y_values = randomNumber + old_y_values;
					values[1] = Integer.toString(new_y_values);
					String s2 = (values[0] + "," + values[1]);
					Creater.write(s2);
					Creater.newLine();
					Creater.flush();
				}
				linenum = linenum + 1; 
			}
			System.out.println("Salting is complete");
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
