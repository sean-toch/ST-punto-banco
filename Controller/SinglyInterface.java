package Controller;

/**
 * This is an interface for the singly linked list stack
 * @author Sean Tocheniuk - 201714911
 * Last Modified: <2022-10-13> - <Added javadoc details> <Sean Tocheniuk>
 */
public interface SinglyInterface<T> 
{
	void addToStart(T t);
	void addToEnd(T t);
	T removeFromStart();
	T removeFromEnd();
	boolean isEmpty();
	void print();
	int size();
}

