
public class Card 
{
	String suite;
	String faceValue;
	int value;
		
	public Card(String suite, int value) 
	{
		super();
		this.suite = suite;
		this.value = value;
	}
	
	public Card(String suite, String faceValue, int value)
	{
		this.suite = suite;
	    this.faceValue = faceValue;
	    this.value = value;
	}

	
	public String getSuite() 
	{
		return suite;
	}
	public String getFaceValue() 
	{
		return faceValue;
	}

	public int getValue() 
	{
		return this.value;
	}
	
	

}
