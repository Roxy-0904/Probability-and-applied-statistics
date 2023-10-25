import java.util.ArrayList;

public class Card 
{
	ArrayList<String> suite = new ArrayList<String>();
	ArrayList<String> value = new ArrayList<String>();
	
	public Card(ArrayList<String> suite, ArrayList<String> value) {
		super();
		this.suite = suite;
		this.value = value;
	}
	public ArrayList<String> getSuite() {
		return suite;
	}
	public void setSuite(ArrayList<String> suite) {
		this.suite = suite;
	}
	public ArrayList<String> getValue() {
		return value;
	}
	public void setValue(ArrayList<String> value) {
		this.value = value;
	}
	
	
	
	
	
	
	

}
