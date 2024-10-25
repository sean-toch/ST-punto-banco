package Controller;

import java.util.Random;

/**
 * This class uses the generic doubly linked list classes and the card class to create a card deck
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class CardDeck 
{
	/**
	 * Doubly linked list object that holds card objects 
	 */
	private DoublyLinkedList<Card> deck;
	
	/**
	 * Singly linked list stack that holds player 1's hand
	 */
	private LinkedListStack P1;
	
	/**
	 * Singly linked list stack that holds player 2's hand
	 */
	private LinkedListStack P2;
	
	
	
	/**
	 * Constructor that creates a deck and shuffles it
	 */
	public CardDeck() 
	{
		deck = new DoublyLinkedList<>();
		createDeck();
		System.out.println("");
	}

	
	
	/**
	 * This method Loops through creates card objects and adds them to the deck
	 */
	private void createDeck() 
	{
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		
		for (int i = 0 ; i < 4; i++) 
		{
			for (int j = 1 ; j <=13 ; j++) 
			{
				Card C = new Card (j,suits[i]);
				deck.addToStart(C);
			}
		}
	}

	
	
	/**
	 * This method shuffles the deck by taking the front card and putting it in a random spot in the deck 50 times
	 * then then doing the same with the back card also 50 times. This ensures a thoroughly shuffled deck every time.
	 */
	public void shuffleDeck() 
	{
		Random r = new Random();
		Card pulledFromStart = new Card(0, null);
		Card pulledFromEnd = new Card(0, null);
		int low = 0;
		int high = 51;
		int randomNum;

		//This loop takes the start card and puts it a random position in the deck
		for (int i = 0 ; i < 50; i++) 
		{
			pulledFromStart = deck.removeFromStart(); 
			randomNum = r.nextInt(high-low) + low;
			deck.addAt(randomNum, pulledFromStart);		
		}
		
		//This loop takes the end card and puts it a random position in the deck
		for (int i = 0 ; i < 50; i++) 
		{
			pulledFromEnd = deck.removeFromEnd(); 
			randomNum = r.nextInt(high-low) + low;
			deck.addAt(randomNum, pulledFromEnd);		
		}
	}
	
	
	
	/**
	 * This method call the shuffle deck method then loops through the deck and deals cards back and forth 
	 * between the 2 players until both players have the specified number of cards
	 * @param dealNum holds integer value of how many cards will be dealt to each player
	 */
	public void dealCards(int dealNum)
	{
		Card P1Card = new Card(0, null);
		Card P2Card = new Card(0, null);
		P1 = new LinkedListStack();
		P2 = new LinkedListStack();
		
		shuffleDeck();
		
		for(int i = 0 ; i < dealNum; i++)
		{
			P1Card = deck.removeFromStart();
			P1.addToStart(P1Card);
			
			P2Card = deck.removeFromStart();
			P2.addToStart(P2Card);
			
		}
		System.out.println("Newly dealt Player 1 Hand:");
		P1.print();
        System.out.println(" ");
        System.out.println("Newly dealt Player 2 hand: ");
        P2.print();
	}

	
	
	/**
	 * Getter method for player 1 hand 
	 * @return p1 hand
	 */
	public LinkedListStack getP1() 
	{
		return P1;
	}

	/**
	 * Getter method for player 2 hand 
	 * @return p2 hand
	 */
	public LinkedListStack getP2() 
	{
		return P2;
	}


	
	/**
	 * The deck getter method also prints the deck
	 * @return deck
	 */
	public DoublyLinkedList<Card> getDeck()
	{
		 deck.print();
		 return deck;
	}
	
	
	
	/**
	 * Runs the deckSize() method in the doubly linked list class and returns it
	 * @return
	 */
	public int deckSize()
	{
		return deck.getSize();
	}
}
