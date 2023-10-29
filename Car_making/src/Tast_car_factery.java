import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Tast_car_factery 
{
	public static void main(String[] args)
	{
		Factery car = new Factery();
		
		car.carbuilder(1000);
	
		// this try catch writes the cars that are created to a csv file that it creates
		try (FileWriter writer = new FileWriter("Car_Indvintory.csv");
             BufferedWriter Creater = new BufferedWriter(writer))
		{
			for(int i = 0; i < car.Invintory.size(); i++)
			{
				Creater.write(car.Invintory.get(i).getCartype()+ "," + Integer.toString(car.Invintory.get(i).getYear()) + "," + car.Invintory.get(i).getColor() + "," + Integer.toString(car.Invintory.get(i).getMiles()) + "\n");
			}
			System.out.println("Car invinintory compleate");
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		// this try catch reads from the csv car inventory file that is created and prints out the contents
		BufferedReader objReader = null;
		try 
		{
			   String strLine;

			   objReader = new BufferedReader(new FileReader("Car_Indvintory.csv"));

			   while ((strLine = objReader.readLine()) != null) 
			   {

			    System.out.println(strLine);
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
		
	}

}
