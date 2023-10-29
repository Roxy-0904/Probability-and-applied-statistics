
public class Test_monte_carlo_simulation 
{
	 public static void main(String[]args) 
	 {
		HandEvaluator hand = new HandEvaluator();
		hand.printDeck();
		
		hand.shuffleDeck();
        hand.printDeck();
        
        hand.drawHand(5);
        hand.printHand();
        
        HandEvaluator monteSim = new HandEvaluator();

        System.out.println("\n===== Monte Carlo Simulation of Poker Hands =====");
        monteSim.runMonteCarlo(1000000, 5);
	 }
	

}
