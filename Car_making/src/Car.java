
public class Car 
{
	private String Cartype;
	private int year;
	private String color;
	private int miles;
	public Car(String cartype, int year, String color, int miles) 
	{
		super();
		Cartype = cartype;
		this.year = year;
		this.color = color;
		this.miles = miles;
	}
	public String getCartype() {
		return Cartype;
	}
	public void setCartype(String cartype) {
		Cartype = cartype;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	

}
