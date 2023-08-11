package myLibrary.GraphAlgo;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * AdjacencyMatrix.java
 *
 * Class Name: AdjacencyMatrix
 * 
 * Creation of an adjacency matrix.
 * 
 */
public class AdjacencyMatrix 
{
	
	// Define adjacency matrix
	int nodes;
	int[][] matrix;

	
	public AdjacencyMatrix(int nodes)
	{
		this.nodes  = nodes;
		this.matrix = new int[nodes + 1][nodes + 1];
	}
	
	// Add new edges
    public void addEdge(int source, int destination, int cost) 
    {
    	if (source >= 0 && source < nodes && destination >= 0 && destination < nodes)
    	{
    		matrix[source][destination] = cost;
    		matrix[destination][source] = cost;
    	}
    }
    
    // return adjacency matrix
    public int[][] getAdjacencyMatrix() 
    {
    	return matrix;
    }

    // Display adjacency matrix
    public void displayAdjacencyMatrix() 
    {	   
	    for (int i = 0; i < nodes; i++) 
	    {
	    	System.out.print("Node " + i + ": ");
	    	for (int j = 0; j < nodes; j++)
	    	{
			    System.out.print(matrix[i][j] + " ");
	    	}
	    	System.out.println();
	    }
    }
    
    // Add any other parts needed
    
}

