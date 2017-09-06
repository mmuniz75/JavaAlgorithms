package hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountingInversions {

	@Test
	public void test() {
		assertEquals(0,countInversions(new int[]{1,1,1,2,2}));
	}
	
	@Test
	public void test2() {
		assertEquals(4,countInversions(new int[]{2,1,3,1,2}));
	}
	
 	private static long countInversions(int[] arr) {
        int[] aux = arr.clone();
        return countInversions(arr, 0, arr.length - 1, aux);
    }

    private static long countInversions(int[] arr, int lo, int hi, int[] aux) {
        if (lo >= hi) return 0;

        int mid = lo + (hi - lo) / 2;

        long count = 0;
        count += countInversions(aux, lo, mid, arr);
        count += countInversions(aux, mid + 1, hi, arr);
        count += merge(arr, lo, mid, hi, aux);

        return count;
    }

    private static long merge(int[] arr, int lo, int mid, int hi, int[] aux) {
        long count = 0;
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid || j <= hi) {
            if (i > mid) {
                arr[k++] = aux[j++];
            } else if (j > hi) {
                arr[k++] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                arr[k++] = aux[i++];
            } else {
                arr[k++] = aux[j++];
                count += mid + 1 - i;
            }
        }

        return count;
    }

	
	
	private long countInversions2(int[] arr) {
	  long count = 0;
      
	  for(int i=0;i<arr.length;i++){
    	for(int j=i;j<arr.length;j++){
    		if(arr[i]>arr[j]){
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			count++;
    		}
    	}
	  }
      
      return count;
	}

}
