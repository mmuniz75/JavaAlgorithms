
package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxSliceSum {
	
	@Test
	public void test(){
		int[] numbers = new int[]{3,2,-6,4,0};
		assertEquals(5,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{10};
		assertEquals(10,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{10,4};
		assertEquals(14,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[]{-2, 1};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test5(){
		int[] numbers = new int[]{-10};
		assertEquals(-10,solution(numbers));
	}
	
	
	
	public int solution(int[] A){
		int lastsum = 0;
		int maxsum = Integer.MIN_VALUE;
		
		for(int i=0;i<A.length;i++){
			lastsum = Math.max(A[i], lastsum + A[i]);
			maxsum = Math.max(lastsum, maxsum);
		}
		
		return maxsum;
	}

}
