package hackerrank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BubbleSort {

	@Test
	public void test() {
		assertEquals(0,solution(new int[]{1,2,3}) );
	}
	
	@Test
	public void test2() {
		assertEquals(3,solution(new int[]{3,2,1}) );
	}
	
	public int solution(int[] a){
		int n = a.length;
		int totalSwaps = 0;
		for (int i = 0; i < n; i++) {
		    // Track number of elements swapped during a single array traversal
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		        	int temp = a[j];
		        	a[j] = a[j + 1];
		        	a[j + 1] = temp;
		            numberOfSwaps++;
		        }
		    }
		    totalSwaps += numberOfSwaps;
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
		
		System.out.println("Array is sorted in " + totalSwaps + "swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length-1]);
		return totalSwaps;
	}
	
			
	

}
