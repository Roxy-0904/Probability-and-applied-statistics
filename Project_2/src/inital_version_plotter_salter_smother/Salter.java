package inital_version_plotter_salter_smother;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * used as refrence https://github.com/ilindaa/Project-1/blob/main/Project1/src/GraphProgram/GraphProgram.java
 */
public class Salter 
{
	int linenum = 0;
	private static final Random n = new Random();
	public void  readunsaltedvalues(String filename,int minsaltvalue, int maxsaltvalue)
	{
	 
		
		BufferedReader objReader = null;
		FileWriter writer = null;
		try 
		{
			objReader = new BufferedReader(new FileReader(filename));
			writer = new FileWriter("Function_points_salted.csv", true);
			String strLine = "";
			while ((strLine = objReader.readLine()) != null) 
			{
				if (linenum == 0)
				{
					String firstline = ("x" + "," + "y\n");
					writer.write(firstline);
					writer.flush();
				}
				else
				{
					String[] values = strLine.split(",");
					int randomNumber = n.nextInt(maxsaltvalue - minsaltvalue / 2);
					int old_y_values = Integer.parseInt(values[1]);
					int new_y_values = randomNumber + old_y_values;
					values[1] = Integer.toString(new_y_values);
					String s2 = (values[0] + "," + values[1]+ "\n");
					writer.write(s2);
					writer.flush();
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
			   } 
			   catch (IOException ex) 
			   {
			    ex.printStackTrace();
			   }
		}
		
	}	
}
