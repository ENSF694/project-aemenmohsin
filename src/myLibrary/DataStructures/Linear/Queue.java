package myLibrary.DataStructures.Linear;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Queue.java
 *
 * Class Name: Queue
 * 
 * Create a queue to be used by SLL and DLL.
 * 
 */
public class Queue 
{
	
	// Define Queue
	private int max_size;
	private int queue[];
	private int head; // also known as front
	private int tail; // also known as rear
	
	public Queue(int max_size)
	{
		this.queue  = new int[max_size];
		this.max_size = max_size;
		this.head = -1;
		this.tail = -1;
	}
	
	// Enqueue
	public void enqueue(int data)
	{	
		if(tail == max_size-1)
		{
			System.out.println("Queue is Full - Overflow");
			return;
		}
		else
		{
			if(head == -1 && tail == -1)
			{
				head = 0;
				tail = 0;
			}
			else
			{
				tail = tail + 1;
			}
			queue[tail] = data;
		}
	}
	
	// Dequeue
	public int dequeue()
	{
		int data;
		if(head < 0 || head > tail)
		{
			System.out.println("Queue is Empty - Underflow");
			return -1;
		}
		else
		{
			data = queue[head];
			queue[head] = 0; // to remove the data from array
			head = head + 1;
		}
		return data;
	}
	
	// Display queue
	public void display()
	{
		for(int i = 0; i <= queue.length - 1 ; i++)
		{
			System.out.print(queue[i] + " ");
		}
	}

	// Add any other parts needed
}
