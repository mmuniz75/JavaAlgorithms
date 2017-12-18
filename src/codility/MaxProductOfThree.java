package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxProductOfThree {
	
	@Test
	public void test(){
		int[] numbers = new int[]{-3,1,2,-2,5,6};
		assertEquals(60,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{-5, 5, -5, 4};
		assertEquals(125,solution(numbers));
	}
	
	
	public int solution(int[] A){
		Arrays.sort(A);
		int start =  A[0] * A[1] * A[A.length-1];
		int end =  A[A.length-1] * A[A.length-2] * A[A.length-3];
		
		return start>end?start:end;
	}
	


}
