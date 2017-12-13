package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TapeEquilibrium {
	
	@Test
	public void test(){
		int[] numbers = new int[]{3,1,2,4,3};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{-1000, 1000};
		assertEquals(2000,solution(numbers));
	}
	
	
	public int solution(int[] A){
		Integer result = null;
		
		int total = 0;
		for(int i=0;i<A.length;i++)
			total+=A[i];
		
		int a = 0;
		for(int i=0;i<A.length-1;i++){
			a += A[i];
			int b = total - a;
			int x = Math.abs(b-a);
			if(result == null || x<result)
				result = x;
		}
		
		return result;
	}

}
