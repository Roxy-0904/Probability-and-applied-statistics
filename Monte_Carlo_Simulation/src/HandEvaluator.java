import java.util.ArrayList;
public class HandEvaluator 
{
	ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public HandEvaluator(ArrayList<Card> deck) 
	{
		super();
		this.deck = deck;
	}
	
	public void Pullacard(ArrayList<Card> deck)
	{
		deck = Card.getSuite();
		
	}
	
	public void Draw_hand(ArrayList<Card> deck, ArrayList<Card> hand)
	{
		Pullacard(deck);
		
	}
	
	

}
