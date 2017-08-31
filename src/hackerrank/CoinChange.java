package hackerrank;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.TestCase;

public class CoinChange extends TestCase {
	
	
	@Test
	public void test1() {
		assertEquals(4,solution2(4,new int[]{1,2,3}));
	
	}
	
	
	@Test
	public void test2() {
		assertEquals(10,solution2(10,new int[]{10,5,6,4,2,3}));
	
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
		assertEquals(5,solution2(10,new int[]{2,5,3,6}));
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
		assertEquals(1,solution2(1,new int[]{1,2,3,4}));
	}
	
	@Test
	public void test5() {
		assertEquals(3,solution2(3,new int[]{3,1,2}));
	}
	
	@Test
	public void test6() {
		assertEquals(3,solution2(10,new int[]{7,4,3,6}));
	}
		
	@Test
	public void test7() {
		assertEquals(2,solution2(2,new int[]{1,2,3,4}));
	}
	
	@Test
	public void test8() {
		assertEquals(2,solution2(2,new int[]{4,3,2,1}));
	}
	@Test
	public void test9() {
		assertEquals(2,solution2(2,new int[]{2,4,1,3}));
	}
	
	@Test
	public void test10() {
		assertEquals(4,solution2(4,new int[]{2,4,1}));
	}

	@Test
	public void test11() {
		assertEquals(3,solution2(10,new int[]{7,4,3,6}));
	}
	/*
	 * 7,3
	 * 6,4
	 * 4,3,3
	 */
	
	@Test
	public void test12() {
		assertEquals(11,solution2(12,new int[]{2,3,4,6}));
	}
	
	
	
	private long solution2(int money,int[] coins){
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
	
	

	
	private int solution(int money,int[] coins){
		
		int count = 0;
		HashMap<Integer,Integer> coinsMap = new HashMap<>();
		
		for(int coin:coins){
			if(coinsMap.containsKey(coin))
				coinsMap.put(coin,coinsMap.get(coin)+1);
			else
				coinsMap.put(coin,1);
		}
		
		int rest = money;
		for(int coin:coinsMap.keySet()){
			int value = coinsMap.get(coin);
			if(value>rest)
				continue;
			
			rest -= value;
			if(coinsMap.containsKey(rest)){
				count++;
				int countCoin = coinsMap.get(rest)-1; 
				if(countCoin==0)
					coinsMap.remove(countCoin);
				else
					coinsMap.put(rest, countCoin);
				rest = money;
			}
			
			
		}
		
		return count;
	}

		
}
