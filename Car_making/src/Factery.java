import java.util.Random;
import java.util.ArrayList;

public class Factery 
{
	Random rand = new Random();
	ArrayList<Car> Invintory = new ArrayList<>();
	public void carbuilder(int stocknum)
	{
		for(int i = 0; i < stocknum; i++)
		{
			String carType = carType();
			int carYear= rand.nextInt(2020-1970)+1970;
			String carColor = carColor();
			int carMiles = rand.nextInt(25000);
		
			Car car = new Car(carType, carYear, carColor, carMiles);
			Invintory.add(car);
		}
		
		
	}
	
	public String carType()
	{
		Random Type = new Random();
		ArrayList<String> CarType = new ArrayList<>();
		CarType.add("Toyota");
		CarType.add("Ford");
		CarType.add("Honda");
		CarType.add("Sedan");
		CarType.add("Chrysler");
		CarType.add("Mazda");
		CarType.add("Sedan");//Rigging data
		
		return CarType.get(Type.nextInt(CarType.size()));
	}
	
	
	
	public String carColor()
	{
		Random Color = new Random();
		ArrayList<String> CarColor = new ArrayList<>();
		CarColor.add("Red");
		CarColor.add("Black");
		CarColor.add("Blue");
		CarColor.add("White");
		CarColor.add("Yellow");
		CarColor.add("Purple");
		CarColor.add("Red");//Rigging data
		
		return CarColor.get(Color.nextInt(CarColor.size()));
	}
	
	
}
