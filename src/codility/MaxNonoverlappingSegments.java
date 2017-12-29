package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxNonoverlappingSegments {
	
	@Test
	public void test(){
		int[] A = new int[]{1,3,7,9,9};
		int[] B = new int[]{5,6,8,9,10};
		
		assertEquals(3,solution(A,B));
	}
	
	public int solution(int[] A, int[] B){
		int N = A.length;
        if (N <= 1) {
            return N;
        }
        
        int cnt = 1;
        int prev_end = B[0];
        
        int curr;
        for (curr = 1; curr < N; curr++) {
            if (A[curr] > prev_end) {
                cnt++;
                prev_end = B[curr];
            }
        }
        
        return cnt;
	}

}
