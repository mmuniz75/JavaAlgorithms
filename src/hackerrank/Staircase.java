package hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class Staircase {

	@Test
	public void test() {
		assertEquals(1,solution(1));
	}
	
	@Test
	public void test1() {
		assertEquals(2,solution(2));
	}
	
	
	@Test
	public void test2() {
		assertEquals(4,solution(3));
	}
	
		
	@Test
	public void test3() {
		assertEquals(44,solution(7));
	}
	
	@Test
	public void test4() {
		assertEquals(81,solution(8));
	}
	
	@Test
	public void test5() {
		assertEquals(149,solution(9));
	}
	
	@Test
	public void test6() {
		assertEquals(7,solution(4));
	}
	
	private int solution(int stairs){
		int[] dp = new int[3];
		dp[0]=1;
		dp[1]=2;
		dp[2]=4;
		
		for(int i=3;i<stairs;i++)
			dp[i%3] = dp[0] + dp[1] + dp[2];
						
		return dp[(stairs-1)%3];
	}

}
