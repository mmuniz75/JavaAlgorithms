package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CountTriangles {
	
	@Test
	public void test(){
		int[] numbers = new int[]{10,2,5,1,8,12};
		assertEquals(4,solution(numbers));
	}
	
	public int solution(int[] A){
	    int count = 0;
	    Arrays.sort(A);
	 
	    for (int P=0;P<A.length-2;P++){
	    	int Q = P + 1;
	    	int R = P + 2;
	    	while (R < A.length){
	            if (A[P] + A[Q] > A[R]){
	                count += R - Q;
	                R += 1;
	            }else if (Q < R -1)
	                Q += 1;
	            else {
	                R += 1;
	                Q += 1;
	            }    
	    	}
	    }	
	    
	    return count;
		
	}
	
	

}
