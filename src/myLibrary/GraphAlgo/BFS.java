package myLibrary.GraphAlgo;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * BFS.java
 *
 * Class Name: BFS
 * 
 * Using breadth first search on a graph.
 * 
 */
import java.util.Arrays;

public class BFS 
{
	
	// Define BFS 
	int nodes;
	int[][] matrix;
	
	// You can use either adjacency matrix or adjacency list to keep track of the graph
	public BFS(int nodes)
	{
		this.nodes  = nodes;
		this.matrix = new int[nodes + 1][nodes + 1];
	}
	
	// Add edge to graph
    public void addEdge(int v,int w)
    {
    	if (v >= 0 && v < nodes && w >= 0 && w < nodes)
    	{
    		matrix[v][w] = 1;
    		matrix[w][v] = 1;
    	}
    }
 
    // Apply BFS algorithm and display the nodes visited and the visit array values
    // See the sample output to create a proper format
    public void BFS_Algo(int s)
    {
		int size = matrix.length;
		boolean visited[] = new boolean[size - 1];
		
		//	let Q be queue.
		Queue Q = new Queue(size);
		int[] array = new int[size-1];
		int count = 0;
		
		Q.enqueue(s); //Inserting s in queue until all its neighbour vertices are marked.
		
		visited[s] = true; // mark s as visited
		
		while (!Q.isEmpty())//	while ( Q is not empty)
		{
			// Removing that vertex from queue, whose neighbour will be visited now
			int v = Q.dequeue();
			array[count++] = v;
			// processing all the neighbours of v
			// for all neighbours w of v in Graph G
			for (int w = 0; w < size; w++)
			{
				// if w is not visited
				if (matrix[v][w] == 1 && !visited[w])
				{
					Q.enqueue(w); // Stores w in Q to further visit its neighbour
					visited[w] = true; // mark w as visited
				}
			}
		}		
		for (int i = 0; i < size-1; i++)
		{
			System.out.print(array[i] + " - ");
		}
		System.out.print("\nVisited Nodes:");
		System.out.println(Arrays.toString(visited));
    }
	
	// Add any other parts needed
}
