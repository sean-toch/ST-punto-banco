package Controller;

/**
 * This class creates a generic doubly linked list node
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public class DoublyNode<type>
{
	/**
	 * Holds the data of the node
	 */
	private type data;
	
	/**
	 * Holds the next node in the list
	 */
	private DoublyNode<type> next = null;
	
	/**
	 * Holds the previous node in the list
	 */
	private DoublyNode<type> previous = null;
	
	
	/**
	 * Constructor
	 */
	public DoublyNode() 
	{ 
		data = null; 
	}
	
	/**
	 * Constructor
	 * @param data of the node
	 */
	public DoublyNode(type data) 
	{ 
		this.data = data; 
	}
	
	
	/**
	 * Getter for the node data
	 * @return data of the node
	 */
	public type getData() 
	{
		return data; 
	}
	
	/**
	 * Setter for the node data
	 * @param value of the node
	 */
	public void setData(type value) 
	{ 
		data = value; 
	}
	
	
	/**
	 * Setter for The next node 
	 * @param other node
	 */
	public void setNext(DoublyNode<type> other)
	{ 
		this.next = other; 
	}
	
	/**
	 * Getter for the next node
	 * @return next node
	 */
	public DoublyNode<type> getNext() 
	{ 
		return this.next; 
	}
	
	
	/**
	 * Setter for The previous node 
	 * @param other node
	 */
	public void setPrevious(DoublyNode<type> other)
	{ 
		this.previous = other; 
	}
	
	/**
	 * Getter for the previous node
	 * @return previous node
	 */
	public DoublyNode<type> getPrevious() 
	{ 
		return this.previous; 
	}
}
