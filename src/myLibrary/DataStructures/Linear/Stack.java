package myLibrary.DataStructures.Linear;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Stack.java
 *
 * Class Name: Stack
 * 
 * Create a stack to be used by SLL and DLL.
 * 
 */

public class Stack 
{
	
	// Define stack
	private int max_size;
	private int stack[];
	private int top;
	
	public Stack(int max_size)
	{
		this.stack  = new int[max_size];
		this.max_size = max_size;
		this.top = -1;
	}
	
	// Push 
	public void push(int data)
	{
		if (top == max_size - 1)
		{
			System.out.println("Stack is Full - Overflow");
			return;
		}
		else
		{
			top = top + 1;
			stack[top] = data;
		}
	}
	
	// Pop
	public int pop()
	{
		int data;
		if (top < 0)
		{
			System.out.println("Stack is Empty - Underflow");
			return -1;
		}
		else
		{
			data = stack[top];
			stack[top] = 0;
			top = top - 1;
		}
		return data;
	}
	
	// Display stack
	public void display()
	{
		for(int i = 0; i <= stack.length - 1 ; i++)
		{
			System.out.print(stack[i] + " ");
		}
	}
	
	// Add any other parts needed

}
