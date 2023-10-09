import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Tast_car_factery 
{
	public static void main(String[] args)
	{
		Factery car = new Factery();
		
		car.carbuilder(1000);
	
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
		
		
	}

}
