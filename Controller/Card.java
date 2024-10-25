
package Controller;

/**
 * This class creates a card object for the game
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class Card 
{

	/**
	 * integer value of current cards rank
	 */
	private int rank;
	
	/**
	 * String value of current cards suit
	 */
	private String suit;

	/**
	 * This constructor sets the rank and suit of card
	 * @param rank shows the rank of the card
	 * @param suit shows the suit of the card
	 */
	public Card(int rank, String suit) 
	{
		this.rank = rank;
		this.suit = suit;
	}

	
	/**
	 * This method returns a 1 if current card is greater than other card 
	 * and a 2 if current card is less than other card
	 * @param other
	 * @return
	 */
	public int isEqual(Card other)
	{
		int result = 0;
		int otherRank = other.getRank();
		
		
		if(this.rank == otherRank)
		{
			int otherSuitVal = 0;
			int currSuitVal = 0;
			
			//Assigns currSuitVal based on which suit the current card is
			if(this.suit == "Spades")
			{
				currSuitVal = 4;
			}
			else if(this.suit == "Hearts")
			{
				currSuitVal = 3;
			}
			else if(this.suit == "Diamonds")
			{
				currSuitVal = 2;
			}
			else if(this.suit == "Clubs")
			{
				currSuitVal = 1;
			}
			
			//Assigns otherSuitVal based on which suit the other card is
			if(other.getSuit() == "Spades")
			{
				otherSuitVal = 4;
			}
			else if(other.getSuit() == "Hearts")
			{
				otherSuitVal = 3;
			}
			else if(other.getSuit() == "Diamonds")
			{
				otherSuitVal = 2;
			}
			else if(other.getSuit() == "Clubs")
			{
				otherSuitVal = 1;
			}
			
			//compares currSuitVal and otherSuitVal and determines the result
			if(currSuitVal > otherSuitVal)
			{
				result = 1;
			}
			else if(currSuitVal < otherSuitVal)
			{
				result = 2;
			}
			
		}
		else if(this.rank > otherRank)
		{
			result = 1;
		}
		else if(this.rank < otherRank)
		{
			result = 2;
		}
		
		return result;
	}
	
	
	
	/**
	 * Getter for rank
	 * @return rank of the card
	 */
	public int getRank() 
	{
		return rank;
	}

	/**
	 * Setter for rank
	 * @param rank of the card
	 */
	public void setRank(int rank) 
	{
		this.rank = rank;
	}

	
	
	/**
	 * Getter for suit
	 * @return suit of the card
	 */
	public String getSuit() 
	{
		return suit;
	}

	/**
	 * Setter for suit
	 * @param suit of the card
	 */
	public void setSuit(String suit) 
	{
		this.suit = suit;
	}

	/**
	 * this method returns the card in a readable format
	 * @return formatted name and suit of the card 
	 */
	public String getCard()
	{
		String name = "King of ";
		
		if (rank >= 2 && rank <= 10)
		{
			name = rank + " of ";
		}
		else if (rank == 1)
		{
			name = "Ace of ";
		}	
		else if (rank == 11)
		{
			name = "Jack of ";
		}
		else if (rank == 12)
		{
			name = "Queen of ";
		}
		
		return name + suit;
	}
	
	/**
	 * This toString prints out the card in a readable format
	 */
	public String toString() 
	{
		
		String name = "King of ";
		
		if (rank >= 2 && rank <= 10)
		{
			name = rank + " of ";
		}
		else if (rank == 1)
		{
			name = "Ace of ";
		}	
		else if (rank == 11)
		{
			name = "Jack of ";
		}
		else if (rank == 12)
		{
			name = "Queen of ";
		}
		
		return name + suit;
	}

}
	