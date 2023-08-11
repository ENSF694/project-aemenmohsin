package myLibrary.DataStructures.Linear;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * SLL.java
 *
 * Class Name: SLL
 * 
 * Create a single linked list.
 * 
 */

//Define node
// Create node
class Node
{
	int data; // Data
	Node next; // Pointer
	
	public Node(int d) // Constructor method
	{
		data = d;
		next = null;
	}	
}

public class SLL 
{
	public Node head = null;
	public Node tail = null;
	
	// Add node to SLL
    public void addNode(int data) 
    {   
    	Node newNode = new Node(data);
		
		if(head == null) //Checks if the list is empty, then head tail both will point to new node
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode; // else new node will be added at the end
			tail = newNode;
		}
    }   
    
    // Search node in SLL
    public int searchNode(int key)
    {
    	Node current = head; // Initialize current
    	int i = 0;    	
    	if (head == null)
    	{
    		System.out.println("List empty");
    	}
    	else
    	{
    		while (current != null) 
    		{
	            if (current.data == key)
	            {
	            	return i;
	            }
	            i++;
	            current = current.next;
	        }
    	}
        
		return -1;
    }
    
    // Delete node form SLL
    public void deleteNode(int key) 
    {
    	System.out.println("\nDeleting Node with value " + key);
    	Node temp = head, prev = null;
    	if (temp != null && temp.data == key)
    	{
    		head = temp.next;
    		return;
    	}
    	while (temp != null && temp.data != key)
    	{
	    	prev = temp;
	    	temp = temp.next;
    	}
    	if (temp == null)
    	{
    		return;
    	}
    	prev.next = temp.next;
    }
    
    // Display SLL
    public void display() 
    {      
    	System.out.println("\nCurrent nodes of the singly linked list:");
		Node current = head; // start from the beginning of the list
		if(head == null)
		{
			System.out.println("Singly Linked List is empty");
			return;
		}
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
    } 
    
    // Add any other parts needed

}
