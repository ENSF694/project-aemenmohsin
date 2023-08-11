package myLibrary.DataStructures.SearchSort;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * Sort.java
 *
 * Class Name: Sort
 * 
 * Sorting an array.
 * 
 */
public class Sort 
{
	// Apply one of the sorting algorithms
	// Using quickSort
	public void quickSort(int[] a, int first, int last)
	{
		if (first < last)
		{
			int p = partition(a, first, last);
			quickSort(a, first, p - 1);
			quickSort(a, p + 1, last);
		}
	}
	
	int partition(int[] a, int first, int last)
	{
		// Quicksort code here
		// for ascending order
		
		int pivot = a[last];
		int i = (first - 1);
		for (int j = first; j <= last - 1; j++)
		{
			if (a[j] < pivot)
			{
				i++;
				int temp = a[i]; //swap(a, i, j);
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp1 = a[i+1]; //swap(a, i+1, last);
		a[i+1] = a[last];
		a[last] = temp1;
		return (i + 1);
	}
	
	// Add any other parts needed
}
