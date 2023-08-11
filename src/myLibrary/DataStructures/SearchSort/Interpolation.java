package myLibrary.DataStructures.SearchSort;
import java.util.Arrays;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Interpolation.java
 *
 * Class Name: Interpolation
 * 
 * Using interpolation search on array to find key.
 * 
 */
public class Interpolation 
{
	
	// Apply interpolation search
	public int interpolationSearchIterative(int[] array, int key)
	{
		Arrays.sort(array);
		
		int low = 0;
	    int high = array.length - 1;
	    
	    while (low <= high && key >= array[low] && key <= array[high])
	    {
	    	int pos = low + (high - low) * (key - array[low]) / (array[high] - array[low]);
	    	
	    	if (low == high) 
	    	{
                if (array[low] == key) 
                {
                    return low;
                }
                else
                {
                	return -1; // Key not found
                }
            }

	        if(array[pos] == key)
	        {
	        	return pos;
	        }
	        if(array[pos] < key)
	        {
	        	low = pos + 1;
	        }
	        else
	        {
	        	high = pos - 1;
	        }
	    }
	    return -1; // Key not found
	}
	// Add any other parts needed
}
