package View;

import java.util.Scanner;

/**
 * This class holds the menus that are displayed to the user
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class AppMenu 
{
	Scanner input;
	
	/**
	 * Constructor that instantiates the scanner
	 */
	public AppMenu()
	{
		input = new Scanner(System.in);
	}
	
	
	/**
	 * This asks the user if they would like to play, shuffle or save 
	 * @return option holding the users choice
	 */
	public char showMainMenu()
	{
		char option = '0';
		boolean flag = true;
		System.out.println("Press /Enter/ To Continue...");
		input.nextLine();
		System.out.println(" ");
		
		do
		{
			System.out.println("Select one of the options: \n");
			System.out.println("\t(P) Play Game");
			System.out.println("\t(S) Shuffle Cards");
			System.out.println("\t(E) Exit\n");
			System.out.print("Enter a Choice: ");
			option = input.nextLine().toLowerCase().charAt(0);
			if(option == 'p' || option == 's' || option == 'e')
			{
				flag = false;
			}
		} while(flag);
		
		System.out.println(" ");
		return option;
	}
	
	
	
	/**
	 * This method asks the user how many cards they want dealt
	 * @return dealNum holding the int value the user inputs
	 */
	public int cardNumMenu()
	{
		System.out.print("How many cards to deal? ");
		
		while(!input.hasNextInt())
		{
			input.hasNextLine();
			System.out.print("How many cards to deal? ");
		}
		int dealNum = input.nextInt();
		
		System.out.println(" ");
		
		return dealNum;
	}
}