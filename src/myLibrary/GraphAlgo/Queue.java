package myLibrary.GraphAlgo;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Queue.java
 *
 * Class Name: Queue
 * 
 * Create a queue to be used by the BFS.
 * 
 */
public class Queue 
{
	private int queue[];
	private int max_size;
	private int head; // also known as front
	private int tail; // also known as rear
	
	/**
	 *  Constructor.
	 *  @param int max_size
	 *  @return none
	 */
	public Queue(int max_size)
	{
		this.queue  = new int[max_size];
		this.max_size = max_size;
		this.head = -1;
		this.tail = -1;
	}
	
	/**
	 *  Method to enqueue the int into the array.
	 *  @param Int data
	 *  @return none
	 */
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
	
	/**
	 *  Method to dequeue the char out of the array.
	 *  @param none
	 *  @return int data
	 */
	public int dequeue()
	{
		int data;
		if(head < 0 || head > tail)
		{
			System.out.println("Queue is Empty - Underflow");
			return 0;
		}
		else
		{
			data = queue[head];
			queue[head] = 0; // to remove the data from array
			head = head + 1;
		}
		return data;
	}
	
	/**
	 *  Method if array is empty.
	 *  @param none
	 *  @return head > tail
	 */
	public boolean isEmpty()
	{
		return head > tail;
	}
	
	/**
	 *  Method to display the queue.
	 *  @param none
	 *  @return none
	 */
	public void display()
	{
		System.out.println("\nArray:");
		for(int i = 0; i <= queue.length - 1 ; i++)
		{
			System.out.print(queue[i] + " ");
		}
		System.out.println("\nQueue:");
		for(int i = queue.length - 1; i >= 0 ; i--)
		{
			System.out.println(queue[i] + " ");
		}
	}
}

