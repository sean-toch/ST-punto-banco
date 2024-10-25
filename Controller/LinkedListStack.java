package Controller;

/**
 * This class creates a singly linked list implemented as a stack
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class LinkedListStack implements SinglyInterface<Card>
{
    /**
     * Holds the start node
     */
    private StackNode<Card> start;

    
    /**
     * Constructor
     */
    public LinkedListStack() 
    { 
    	start = null; 
    }
    
    
    /**
     * This method checks if the list is empty
     * @return true if the list is empty and false if its not
     */
    public boolean isEmpty()
    { 
    	return (start == null); 
    }


    /**
     * Removes a node from the start
     * @return node that is removed
     */
    public Card removeFromStart()
    {
        Card data = null;

        if(start != null)
        {
            if(start.getNext() == null)
            {
                data = start.getData();
                start = null;
            }
            else
            {
            	StackNode<Card> tmp = start;
                data = start.getData();
                start = start.getNext();

                tmp.setNext(null);
            }

        }
        return data;
    }
    
    
    /**
     * remove a node from end
     * @return node that is removed
     */
    public Card removeFromEnd()
    {
        if (start == null) 
        {
        	return null;
        }
        
    	Card data = null;
    	
    	if (size() == 1) 
    	{
    		data = start.getData();
        	start = null;
        	return data;
        }

    	StackNode<Card> curr = start;
    	StackNode<Card> prev = start;
       
        while (curr.getNext() != null) 
        {
        	prev = curr;
        	curr = curr.getNext();
        }
        data = curr.getData();
        prev.setNext(null);
        return data;
    }
    
   
    
    /**
     * Adds node to the end of the list
     * @param data of the node
     */
    public void addToEnd(Card data) 
    {
    	StackNode<Card> nodeToAdd = new StackNode<>(data); 
        if(start != null)
        {
        	StackNode<Card> curr = start;

            while(curr.getNext() != null)
            {
               curr = curr.getNext();
            }
            curr.setNext(nodeToAdd);
        }
        else
        {
        	start = nodeToAdd;
        } 
    }
    
    
    /**
     * Adds node to the front of the list
     * @param data of the node
     */
    public void addToStart(Card data) 
    { 
    	StackNode<Card> nodeToAdd = new StackNode<>(data); 
        if(isEmpty())
            start = nodeToAdd;
        else
        {
          nodeToAdd.setNext(start);
          start = nodeToAdd;
        }
    }
    
    
   /**
    * size of the list 
    * @return size
    */
    public int size()
    {
    	StackNode<Card> curr = start;
        int length = 0;

        while(curr != null)
        {
            length++;
            curr = curr.getNext();
        }

        return length;
    }
    
    
    /**
     * Print the list
     */
    public void print()
    {
    	StackNode<Card> curr = start;

        System.out.print("Start->");

        while(curr != null)
        {
            System.out.print("[" + curr.getData() + "]->");
            curr = curr.getNext();
        }

        System.out.println("null");
    }
}
