package Controller;

/**
 * This class creates a generic doubly linked list 
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class DoublyLinkedList<type>
{
	/**
	 * Hold the node at the start of the list
	 */
	private DoublyNode<type> start; 
	
	/**
	 * Holds the node at the end of the list
	 */
	private DoublyNode<type> end; 

	/**
	 * Constructor
	 */
	public DoublyLinkedList() 
    { 
    	start = null; 
    	end = null;
    }
    
	/**
	 * This method checks if the list is empty
	 * @return true if the list is empty, false if it is not 
	 */
    public boolean isEmpty()
    { 
    	return (getSize() == 0); 
    }


   /**
    * Adds a node at a specific index 
    * @param index
    * @param data
    */
    public void addAt (int index, type data)
    {        	
    	DoublyNode<type> nodeToAdd = new DoublyNode<>(data);
        int length = getSize();
        DoublyNode<type> curr = start;
        
        if (index <= length && index >=0)
        {
        	if(index == 0)
        	{
        		addToStart(data);
        	}
        	else if(index == length)
        	{
        		addToEnd(data);
        	}
        	else
        	{
        		curr = start;
                for (int count = 0; count < index; count++)
                {
                	curr = curr.getNext();
                }
                
                DoublyNode<type> ahead = curr.getPrevious(); 
                ahead.setNext(nodeToAdd);
                curr.setPrevious(nodeToAdd);
                nodeToAdd.setPrevious(ahead);
                nodeToAdd.setNext(curr);
        	}
        }  
    }  

    
    
    /**
     * Removes the node from the start of the doubly linked list
     * @return data of the removed object
     */

    public type removeFromStart()
    {
        type data = null;

        if(start != null)
        {
            if(start.getNext() == null)
            {
                data = start.getData();
                start = null;
            }
            else
            {
            	DoublyNode<type> tmp = start.getNext();
            	data = start.getData();
            	start.setNext(null);
            	tmp.setPrevious(null);
            	start = tmp;
            }
            
            
        }
   
        return data;
    }
    
    
    /**
     * Removes the node from the end of the doubly linked list
     * @return data of the removed object
     */
    public type removeFromEnd()
    {
    	 type data = null;

         if(end != null)
         {
             if(end.getPrevious() == null)
             {
                 data = end.getData();
                 end = null;
             }
             else
             {
             	DoublyNode<type> tmp = end.getPrevious();
             	data = end.getData();
             	end.setPrevious(null);
             	tmp.setNext(null);
             	end = tmp;
             }
             
             
         }
    
         return data;
     }
    
   
    
    /**
     * Adds a new node to the end of the doubly linked list
     * @param data
     */
    public void addToEnd(type data) 
    {
    	DoublyNode<type> nodeToAdd = new DoublyNode<>(data);
    	
    	
    	if(start == null) 
    	{
    		start = nodeToAdd;  
    		end = nodeToAdd; 
            start.setPrevious(null);    
            end.setNext(null); 
        } 
    	else
    	{
    		end.setNext(nodeToAdd);
    		nodeToAdd.setPrevious(end);
    		end = nodeToAdd;
    		end.setNext(null);  
        }
    	
    	
    }
    
    
    
    /**
     * Adds a new node to the front of the doubly linked list
     * @param data 
     */
    public void addToStart(type data) 
    {
    	DoublyNode<type> nodeToAdd = new DoublyNode<>(data);  
    	
    	if(start == null) 
    	{
    		start = nodeToAdd;  
    		end = nodeToAdd; 
            start.setPrevious(null);    
            end.setNext(null); 
        }        
        else 
        {
        	start.setPrevious(nodeToAdd);
        	nodeToAdd.setNext(start); 
        	nodeToAdd.setPrevious(null); 
        	start = nodeToAdd;
        }   
    }
    
    
   
   /**
    * get data from an index
    * @param index
    * @return node at that index
    */
   public type get(int index){
       type data = null;
       int length = getSize();
       DoublyNode<type> curr = start;
       
       if (index <= length && index >=0){
           curr = start;
           for (int count = 0; count < index; count++)
               curr = curr.getNext();
           data = curr.getData();    
       }
       return data;
    }
    
   
     
    /**
     * Prints the list
     */
    public void print()
    {
        DoublyNode<type> current = start;  
        if(start == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
              
        while(current != null) 
        {  
            System.out.print(current.getData() + " | ");  
            current = current.getNext();  
        }
    }

    
    
    /**
     * Getter for the start node
     * @return start node
     */
	public DoublyNode<type> getStart() 
	{
		return start;
	}
	
	/**
	 * Getter for the end node 
	 * @return end node 
	 */
	public DoublyNode<type> getEnd() 
	{
		return end;
	}

	
	
	/**
	 * size of the list 
	 * @return size of the list
	 */  
	 public int getSize()
	 {
		 DoublyNode<type> curr = start;
	     int length = 0;

	     while(curr != null)
	     { 
	         length++;
	         curr = curr.getNext();
	     }
	        
	     return length;
	 }
}	