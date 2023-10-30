import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
 * had help from Kaysey
 * @auother heather krencicki
 */
public class HandEvaluator 
{
	ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<Card> deck = new ArrayList<Card>(52);

	public HandEvaluator() 
	{
		fill_deck(deck);
	}
	
	public void fill_deck(ArrayList<Card> deck)
	{
	     if(!deck.isEmpty())
	        {
	            deck.clear();
	        }
		ArrayList<String> Suite = new ArrayList<String>();
		Suite.add("Heart");
        Suite.add("Club");
        Suite.add("Diamond");
        Suite.add("Spade");
     
        
        // number of suites = 4
        for(int i = 0; i < Suite.size(); i++)
        {
            // each suite has 13 cards
            for(int j = 2; j < 15; j++)
            {
            	Card card = new Card(Suite.get(i),j);
            	deck.add(card);
            }
        }
	}
	public void deckshuffeler()
	{
		Collections.shuffle(deck);
	}
	
	public void Pullacard()
	{
		int value = deck.get(0).getValue();
		Card card = new Card(deck.get(0).getSuite(), value);
		hand.add(card);
		deck.remove(0);
	}
	
	public void Draw_hand(int n)
	{
		  if(!hand.isEmpty())
	        {
	            hand.clear();
	        }
		for(int i = 0; i < n; i++)
		{
			Pullacard();
		}
	}


   public void Monte_Carlo_game_player(int n, int c)
   {
	   deckshuffeler();
	   int pair = 0, three = 0, straight = 0, flushe = 0, fullhouse = 0, four = 0, straightFlushe = 0, royalFlushe = 0;
	   for(int i = 0; i < n; i++)
		{
		   Draw_hand(c);
		   if(findpair(hand))
		   {
			   pair++;
		   }
		   if(findthree(hand))
		   {
			   three++;
		   }
		   if(findstraight(hand))
		   {
			   straight++;
		   }
		   if(findflushe(hand))
		   {
			   flushe++;
		   }
		   if(findfullhouse(hand))
		   {
			   fullhouse++;
		   }
		   if(findfour(hand))
		   {
			   four++;
		   }
		   if(findstraightFlushe(hand))
		   {
			   straightFlushe++;
		   }
		   if(findroyalFlushe(hand))
		   {
			   royalFlushe++;
		   }
		   fill_deck(deck);
		   deckshuffeler();
		}
	    System.out.println("\nProbability of Success for **Pair**: " + (double) pair/n*100 + "%");
        System.out.println("\nProbability of Success for **Three of a Kind**: " + (double) three/n*100 + "%");
        System.out.println("\nProbability of Success for **Straight**: " + (double) straight/n*100 + "%");
        System.out.println("\nProbability of Success for **Flush**: " + (double) flushe/n*100 + "%");
        System.out.println("\nProbability of Success for **Full House**: " + (double) fullhouse/n*100 + "%");
        System.out.println("\nProbability of Success for **Four of a Kind**: " + (double) four/n*100 + "%");
        System.out.println("\nProbability of Success for **Straight Flush**: " + (double) straightFlushe/n*100 + "%");
        System.out.println("\nProbability of Success for **Royal Flush**: " + (double) royalFlushe/n*100 + "%");
        
        ArrayList<Integer> handRanking = new ArrayList<>();
        handRanking.add(pair);
        handRanking.add(three);
        handRanking.add(straight);
        handRanking.add(flushe);
        handRanking.add(fullhouse);
        handRanking.add(four);
        handRanking.add(straightFlushe);
        handRanking.add(royalFlushe);

        writeToExcel(handRanking, n);
   }
   private void writeToExcel(ArrayList<Integer> handRanking, int n) 
   {
	   ArrayList<String> Types = new ArrayList<>();
       Types.add("Pair");
       Types.add("Three of a Kind");
       Types.add("Straight");
       Types.add("Flush");
       Types.add("Fullhouse");
       Types.add("Four of a Kind");
       Types.add("Straight Flush");
       Types.add("Royal Flush");
       try (FileWriter writer = new FileWriter("monte_carlo_sim_results.csv");
               BufferedWriter Creater = new BufferedWriter(writer))
  		{
  			for(int i = 0; i < handRanking.size(); i++)
  			{
  				Creater.write(Types.get(i) + "," + String.valueOf(handRanking.get(i)) + "," + String.valueOf((double) handRanking.get(i)/n) + "\n");
  			}
            System.out.println("\n Writing to: monte_carlo_sim_results.csv was successful!");
  		} 
  		catch (IOException e) 
  		{
  			
  			e.printStackTrace();
  		}
   }

public boolean findpair (ArrayList<Card> hand)
   {
	   if (foundmatch(hand,1))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
		   
   }
   public boolean findthree(ArrayList<Card> hand)
   {
	   if (foundmatch(hand,3))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
		   
   }
   public boolean findstraight (ArrayList<Card> hand)
   {
	   if (!checkifSuitesmatch(hand))
	   {
		   if(checkifisaStraight(hand))
           {
               return true;
           }
	   }
	   return false;
	 	   
   }
   
public boolean findflushe (ArrayList<Card> hand)
   {
	   if (checkifSuitesmatch(hand))
	   {
		   return true;
	   }
	   return false;
	   
		   
   }
   public boolean findfullhouse(ArrayList<Card> hand)
   {
	   if (foundmatch(hand,4))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
		   
   }
   public boolean findfour (ArrayList<Card> hand)
   {
	  int match = 0;
        for(int j = 0; j < hand.size(); j++)
        {
            for(int k = j+1; k < hand.size(); k++)
            {
                if(hand.get(j).getValue() == hand.get(k).getValue())
                {
                    match++;
                }
            }

            if(match == 3)
            {
                return true;
            }
            match = 0;
        }
        return false; 
   }
   public boolean findstraightFlushe (ArrayList<Card> hand)
   {
	   if(checkifSuitesmatch(hand) && checkifisaStraight(hand))
        {
            return true;
        }
        return false;
		   
   }
   public boolean findroyalFlushe (ArrayList<Card> hand)
   {
	    if(checkifSuitesmatch(hand) && checkifisaRoyalFlush(hand))
        {
            return true;
        }
        return false;
		   
   }
   public boolean foundmatch(ArrayList<Card> hand, int n)
   {
	   int match = 0;
	   for (int i = 0; i < hand.size();i++)
	   {
		   for (int j = i+1; j < hand.size(); j++)
		   {
			   if (hand.get(i).getValue() ==  hand.get(j).getValue()) 
			   {
				  match++; 
			   }
		   }
	   }
	   if(match == n)
       {
           return true;
       }
       return false;
   }  
   public boolean checkifisaRoyalFlush(ArrayList<Card> hand)
   {
        ArrayList<Integer> faces = new ArrayList<>();  
        faces.add(14);
        faces.add(11);
        faces.add(12);
        faces.add(13);

        int match = 0;

        for(int i = 0; i < hand.size(); i++)
        {
            if(hand.get(i).getValue() > 10)
            {
                for(int j = 0; j < faces.size(); j++)
                {
                    if(hand.get(i).getValue()== faces.get(j))                    {
                        match++;
                        break;
                    }
                }
            }
            else
            {
                if(hand.get(i).getValue() == 10)
                {
                    match++;
                }
            }
        }

        if(match == 5)
        {
            return true;
        }
        return false;
    }
   public boolean checkifisaStraight(ArrayList<Card> hand)
    {
        int inaHand = 0;

        // find the max value in a hand
        int max = hand.get(0).getValue();
        for(int i = 1; i < hand.size(); i++)
        {
            if(hand.get(i).getValue() > max)
            {
                max = hand.get(i).getValue();
            }
        }

        // get range of values - max - 5 and insert into values array
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = max; i > max-5; i--)
        {
            values.add(i);
        }

        // check if hand contains values and remove values
        for(int i = 0; i < hand.size(); i++)
        {
            for(int j = 0; j < values.size(); j++)
            {
                if(hand.get(i).getValue() == values.get(j))
                {
                    inaHand++;
                    values.remove(j);
                }
            }
        }

        if(inaHand == 5)
        {
            return true;
        }
        return false;
    }
   private boolean checkifSuitesmatch(ArrayList<Card> hand) 
   {
	   int matches = 0;
	   for (int i = 1; i < hand.size(); i++)
	   {
		   if(hand.get(0).getSuite().equals(hand.get(i).getSuite()))
		   {
		   		matches++;
		   }
	   }
	   if (matches == hand.size()-1)
	   {
	   		return true;	
	   }
	   else
	   {
	   		return false;
	   }
   }
   public void outputofdeck()
   {
	   for( int i = 0; i < deck.size(); i++)
	   {
		   System.out.print("[" + deck.get(i).getSuite() + " " + deck.get(i).getValue() + "] ");
	   }
	   System.out.println();
   }
   public void outputofcurrenthand()
   {
	   for( int i = 0; i < hand.size(); i++)
	   {
		System.out.print("[" + hand.get(i).getSuite() + " " + hand.get(i).getValue() + "] ");
	   }
	   System.out.println();
   }
}
