package myLibrary.GraphAlgo;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Dijkstra.java
 *
 * Class Name: Dijkstra
 * 
 * Applying the Dijkstra algorithm on a graph.
 * 
 */
public class Dijkstra 
{

	// Apply Dijkstras algorithm
	
	public int minKey(int[] key, boolean[] visited, int nodes)
	{
		int min = Integer.MAX_VALUE;
		int u = -1;
		
		for (int i = 0; i < nodes; i++)
		{
			if (visited[i] == false && key[i] <= min)
			{
				min = key[i];
				u = i;
			}
		}
		return u;
	}

	public void Dijkstra_Algo(int[][] graph, int source) 
	{
		int nodes = graph.length;
		boolean[] visited = new boolean[nodes];
		int[] key = new int[nodes];
		
		for (int i = 0; i < nodes; i++)
		{
			key[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		
		key[source] = 0;
		
		for (int i = 0; i < nodes - 1; i++)
		{
			int u = minKey(key, visited, nodes);
			visited[u] = true;
			
			for (int v = 0; v < nodes; v++)
			{
				if(graph[u][v] != 0 && visited[v] == false && key[u] != Integer.MAX_VALUE && key[u] + graph[u][v] < key[v])
				{
					key[v] = key[u] + graph[u][v];
				}
			}
		}
		for (int i = 0; i < nodes - 1; i++)
		{
			System.out.println("Distance from " + source + " to " + i + " is " + key[i]);
		}
	}
	  
	// Add any other parts needed
}
