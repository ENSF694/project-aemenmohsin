package myLibrary.DataStructures.Linear;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * DLL.java
 *
 * Class Name: DLL
 * 
 * Create a doubly linked list.
 * 
 */

//Define node
//Create node
class nodeDLL
{
	int data; // Data
	nodeDLL next; // Pointer to next
	nodeDLL prev; // Pointer to previous
	
	public nodeDLL(int d) // Constructor method
	{
		data = d;
		next = null;
		prev = null;
	}	
}

public class DLL 
{	
	// Add node
	public nodeDLL head, tail = null;
	
    public void addNode(int data) 
    {    
    	nodeDLL newNode = new nodeDLL(data);
    	
    	if (head == null)
    	{
    		head = tail = newNode;
    		head.prev = null;
    		tail.next = null;
    	}
    	else
    	{
    		tail.next = newNode;
    		newNode.prev = tail;
    		tail = newNode;
    		tail.next = null;
    	}
    }   
    
    // Search node
    public int searchNode(int key)
    {
    	nodeDLL temp = head;
    	int i = 0;
    	
		while (temp.next != null && temp.data != key)
		{
			temp = temp.next;
			i++;
		}
		if (temp.data != key)
		{
			return -1;
		}
		return (i);
    }
    
    // Delete node
    public void deleteNode(int key) 
    {
    	System.out.println("\nDeleting Node with value " + key);

    	nodeDLL temp = head;
    	
    	while (temp.data != key)
		{
			temp = temp.next;
		}
    	if (temp.prev != null)
    	{
    		temp.prev.next = temp.next;
    	}
    	else
		{
    		head = temp.next;
		}
    	if (temp.next != null)
    	{
    		temp.next.prev = temp.prev;
    	}
    }
    
    // Display the DLL
    public void display() 
    {       
    	System.out.println("\nCurrent nodes of the doubly linked list:");

		nodeDLL current = head; // start from the beginning of the list
		
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
