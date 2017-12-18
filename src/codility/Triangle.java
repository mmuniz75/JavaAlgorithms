package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Triangle {
	
	@Test
	public void test(){
		int[] numbers = new int[]{10,2,5,1,8,20};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{10,50,5,1};
		assertEquals(0,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{5,3,3};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
		assertEquals(1,solution(numbers));
	}
	
	public int solution(int[] A){
		Arrays.sort(A);
		
		for(int i=0;i<A.length-2;i++){
			if(	 
				 ((long)A[i] + (long)A[i+1] > A[i+2]) &&  
				 ((long)A[i+1] + (long)A[i+2] > A[i]) &&
				 ((long)A[i] + (long)A[i+2] > A[i+1]) 
			   )
			return 1;	
		}
		return 0;
	}

}
