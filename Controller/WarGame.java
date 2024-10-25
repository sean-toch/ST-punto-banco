package Controller;

import java.util.Scanner;
/**
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class WarGame 
{
	/**
	 * Creates a new cardDeck object for the game
	 */
	private CardDeck deck;
	
	/**
	 * Creates a new linked list stack for the player hands to be transfered into
	 */
	private LinkedListStack P1;
	
	/**
	 * Creates a new linked list stack for the player hands to be transfered into
	 */
	private LinkedListStack P2;
	
	/**
	 * Creates a new card object for the top card to be transfered into
	 */
	private Card P1Card;
	
	/**
	 * Creates a new card object for the top card to be transfered into
	 */
	private Card P2Card;
	
	/**
	 * Holds the points of player 1
	 */
	private int P1Points;
	
	/**
	 * Holds the points of player 2
	 */
	private int P2Points;
	
	/**
	 * Holds the number of cards that are to be dealt to each player
	 */
	private int dealNum;
	
	
	/**
	 * Constructor instantiates objects and assigns values
	 * @param dealNum holds the number of cards to be dealt to each player
	 */
	public WarGame(int dealNum)
	{
		deck = new CardDeck();
		this.dealNum = dealNum;
		deck.dealCards(dealNum);
		P1 = new LinkedListStack();
		P2 = new LinkedListStack();
		P1 = deck.getP1();
		P2 = deck.getP2();
		
	}
	
	
	/**
	 * This method loops through the players hands, compares the cards and keep track of points 
	 */
	public void playWarGame()
	{
		Scanner input = new Scanner(System.in);
		P1Card = new Card(0, null);
		P2Card = new Card(0, null);
		int compare = 0;
		P1Points = 0;
		P2Points = 0;
		
		System.out.println("");
		System.out.println("--------------------------------------");
    	System.out.println("");
    	System.out.println("Press /Enter/ to flip the top cards...");
    	input.nextLine();
		
        for (int i = 0 ; i < dealNum; i++)
        {
        	P1Card = P1.removeFromStart();
        	P2Card = P2.removeFromStart();
        	
        	System.out.println("Player 1 Card: " + P1Card.getCard());
        	System.out.println("Player 2 Card: " + P2Card.getCard());
        	
        	compare = P1Card.isEqual(P2Card);
        	if (compare == 1)
        	{
        		P1Points = P1Points + 1;
        		System.out.println("PLAYER 1 GETS A POINT!");
        		System.out.println(" ");
        	}
        	else if (compare == 2)
        	{
        		P2Points = P2Points + 1;
        		System.out.println("PLAYER 2 GETS A POINT!");
        		System.out.println(" ");
        	}
        	
        	
        	if(i == dealNum - 1)
        	{
        		System.out.println("--------------------------------------");
        		System.out.println("");
        		System.out.println("Press /Enter/ to see the winner...");
        		input.nextLine();
        	}
        	else 
        	{
        		System.out.println("--------------------------------------");
        		System.out.println("");
        		System.out.println("Press /Enter/ to flip the top cards...");
        		input.nextLine();
        	}
        	
        }
        winner(P1Points, P2Points);
    	System.out.println("");
    	System.out.println("**Press /Enter/ to return to the main menu...**");
    	input.nextLine();
   }
	
	
	/**
	 * This method takes both player points, compares them then prints out the winner and their points
	 * @param P1 player 1's points 
	 * @param P2 player 2's points
	 */
	public void winner(int P1, int P2)
	{
		if(P1 == P2)
		{
			System.out.println("**************************************");
        	System.out.println("");
			System.out.println("**ITS A TIE!**");
			System.out.println("Player 1 Points: " + P1);
			System.out.println("Player 2 Points: " + P2);
			System.out.println("");
			System.out.println("**************************************");
		}
		else if(P1 > P2)
		{
			System.out.println("**************************************");
        	System.out.println("");
			System.out.println("**PLAYER 1 WINS!**");
			System.out.println("Player 1 Points: " + P1);
			System.out.println("Player 2 Points: " + P2);
			System.out.println("");
			System.out.println("**************************************");
        	
		}
		else if(P1 < P2)
		{
			System.out.println("**************************************");
        	System.out.println("");
			System.out.println("**PLAYER 2 WINS!**");
			System.out.println("Player 1 Points: " + P1);
			System.out.println("Player 2 Points: " + P2);
			System.out.println("");
			System.out.println("**************************************");
        	
		}
	}

	
	/**
	 * Getter for player 1 points
	 * @return P1 points
	 */
	public int getP1Points() 
	{
		return P1Points;
	}

	/**
	 * Getter for player 2 points
	 * @return P2 points
	 */
	public int getP2Points() 
	{
		return P2Points;
	}
	
	
	
	/**
	 * print method for player 1 hand
	 * @return P1 stack
	 */
	public void printP1() 
	{
		P1.print();
	}

	/**
	 * print method for player 2 hand
	 * @return P2 stack
	 */
	public void printP2() 
	{
		P2.print();
	}
	
	
	
}
