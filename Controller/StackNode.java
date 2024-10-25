package Controller;

/**
 * This class creates a node for the singly linked list
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class StackNode<type>
{
	/**
	 * Holds the data of the node
	 */
    private type data;
    
    /**
     * Holds the next node in the list
     */
    private StackNode<type> next = null;
    
    
    /**
     * Constructor
     */
    public StackNode() 
    { 
    	
    }
    
    /**
     * Constructor
     * @param data of the node
     */
    public StackNode(type data) 
    { 
    	this.data=data; 
    }
    
    
    /**
     * Getter for data
     * @return data of the node
     */
    public type getData()
    { 
    	return data; 
    }
    
    /**
     * Setter for data
     * @param value of the node
     */
    public void setData(type value) 
    { 
    	data = value; 
    }
       
    
    /**
     * Getter for next node
     * @param other node
     */
    public void setNext(StackNode<type> other)
    { 
    	next = other; 
    }
    
    /**
     * Setter for next node
     * @return next node
     */
    public StackNode<type> getNext() 
    { 
    	return next; 
    }
}