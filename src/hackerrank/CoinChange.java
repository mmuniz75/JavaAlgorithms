package hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChange  {
	
	
	@Test
	public void test1() {
		assertEquals(4,solution(4,new int[]{1,2,3}));
	
	}
	
	
	@Test
	public void test2() {
		assertEquals(10,solution(10,new int[]{10,5,6,4,2,3}));
	
	}
	/* 2,2,2,2,2
	 * 2,3,2,3
	 * 10
	 * 5,5
	 * 5,2,3
	 * 6,4
	 * 6,2,2
	 * 4,4,2
	 * 3,3,2,2
	 * 3,3,4
	 */
		
	@Test
	public void test3() {
		assertEquals(5,solution(10,new int[]{2,5,3,6}));
	}
	
	/*
	 * 2,2,2,2,2
	 * 2,3,2,3
	 * 2,3,5
	 * 2,2,6
	 * 5,5
	 * 
	*/
	
	@Test
	public void test4() {
		assertEquals(1,solution(1,new int[]{1,2,3,4}));
	}
	
	@Test
	public void test5() {
		assertEquals(3,solution(3,new int[]{3,1,2}));
	}
	
	@Test
	public void test6() {
		assertEquals(3,solution(10,new int[]{7,4,3,6}));
	}
		
	@Test
	public void test7() {
		assertEquals(2,solution(2,new int[]{1,2,3,4}));
	}
	
	@Test
	public void test8() {
		assertEquals(2,solution(2,new int[]{4,3,2,1}));
	}
	@Test
	public void test9() {
		assertEquals(2,solution(2,new int[]{2,4,1,3}));
	}
	
	@Test
	public void test10() {
		assertEquals(4,solution(4,new int[]{2,4,1}));
	}

	@Test
	public void test11() {
		assertEquals(3,solution(10,new int[]{7,4,3,6}));
	}
	/*
	 * 7,3
	 * 6,4
	 * 4,3,3
	 */
	
	@Test
	public void test12() {
		assertEquals(11,solution(12,new int[]{2,3,4,6}));
	}
	
	
	
	private long solution(int money,int[] coins){
        long[] DP = new long[money + 1]; // O(N) space.
        DP[0] = (long) 1; 	// n == 0 case.
        for(int coin : coins) {
            for(int j = coin; j < DP.length; j++) {
            // The only tricky step.
                DP[j] += DP[j - coin];
            }
        }       
        return DP[money];
    }
	
		
}
