package Controller;

import java.util.Scanner;

import View.AppMenu;


/**
 * This class manages the entire game
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class GameManager 
{
	private Scanner input;
	AppMenu appMen;
	
	/**
	 * Constructor
	 * @throws Exception
	 */
	public GameManager() throws Exception
	{
		input = new Scanner(System.in);
		appMen = new AppMenu();
		launchApplication();
	}

	
	/**
	 * This method controls the main menu 
	 * @throws Exception
	 */
	private void launchApplication() throws Exception 
	{
		boolean flag = true;
		char option;
		
		while(flag)
		{
			option = appMen.showMainMenu();
			
			switch(option)
			{
			case 'p':
				playGame();
				break;
			case 's':
				shuffle();
				break;
			case 'e':
				exit();
				input.close();
				flag = false;
			}
		}
	}


	/**
	 * This method call the cardNumMenu method, gets a value then starts the game
	 */
	private void playGame() 
	{
		int dealNum = -1;
		
		while(true)
		{
			if(dealNum > 0 && dealNum < 27)
			{
				break;
			}
			System.out.println(" ");
			System.out.println("**Value must be between 1-26**");
			dealNum = appMen.cardNumMenu();
		}
		
		WarGame game = new WarGame(dealNum);
		game.playWarGame();
	}
	
	/**
	 * This method creates a new deck, displays it to the user, shuffles it and displays it to the user again
	 */
	private void shuffle()
	{
		CardDeck deckToShuffle = new CardDeck();
		System.out.println("Newly Created Deck:");
		deckToShuffle.getDeck();
		System.out.println(" ");
		deckToShuffle.shuffleDeck();
		System.out.println("Newly Shuffled Deck:");
		deckToShuffle.getDeck();
		System.out.println(" ");
	}
	
	private void exit()
	{
		System.out.println("Hope to see you again!");
	}



	
	


	


	


	

}
