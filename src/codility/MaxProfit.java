package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxProfit {
	
	@Test
	public void test(){
		int[] numbers = new int[]{23171,21011,21123,21366,21013,21367};
		assertEquals(356,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{5,2,4,1,4,8,7};
		assertEquals(7,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{8,2,4,1,5,3,10};
		assertEquals(9,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[]{1,10,1,7,0,8,0,21,0};
		assertEquals(21,solution(numbers));
	}
	
	public int solution(int[] A){
		int profit = 0;
		int maxprofit = 0;
		int calcprofit = 0;
		
		for(int i=1;i<A.length;i++){
			calcprofit = A[i] - A[i-1];
			
			profit = Math.max(0, profit + calcprofit);
			maxprofit = Math.max(profit, maxprofit);
			
		}
		
		return maxprofit;
	}

}
