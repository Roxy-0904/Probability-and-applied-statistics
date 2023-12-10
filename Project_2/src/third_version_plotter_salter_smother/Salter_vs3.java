package third_version_plotter_salter_smother;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Salter_vs3 
{
	private static ArrayList<String[]> datapoints;
	private static final Random n = new Random();
    private static final int saltvalue = 10000;
	public static double addingSalt(int saltvalue)
	{
	   for (String[] row : datapoints) 
	   {
           // Assuming the y value is at index 1
           int y = Integer.parseInt(row[0]);
           int randomNumber = n.nextInt(saltvalue) - saltvalue / 2;
           y += randomNumber;
           row[1] = String.valueOf(y);
	   }
	return saltvalue;
	}
	
	
	 public ArrayList<String[]>  readunsaltedvalues(String filename)
	{
		ArrayList<String[]> dataPoints = new ArrayList<>();
		BufferedReader objReader = null;
		try 
		{
			objReader = new BufferedReader(new FileReader(filename));
			String strLine;
			while ((strLine = objReader.readLine()) != null) 
			{
				String[] values = strLine.split(",");
                dataPoints.add(values);
			}    
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
		return dataPoints;
	}	
	public void salterOfgraph(ArrayList<String[]> dataPoints, int lowlimit)
	{
		try (FileWriter writer = new FileWriter("Function_points_salted.csv");
	             BufferedWriter Creater = new BufferedWriter(writer))
			{
				Creater.write("X,Y");
				Creater.newLine();
				readunsaltedvalues("Function_points");
				double salt = addingSalt(saltvalue);
				for(int i = 0; i <= datapoints.size(); i++)
				{		
					double x = lowlimit + i;
					Creater.write(x + "," +  salt);
					Creater.newLine();
				}
				System.out.println("Salting is compleate");
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
	}

}
