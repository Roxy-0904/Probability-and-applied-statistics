
public class Card 
{
	private String suite;
	private int value ;
	
	public Card(String suite, int value) 
	{
		super();
		this.suite = suite;
		this.value = value;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
