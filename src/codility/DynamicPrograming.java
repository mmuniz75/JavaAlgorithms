package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class DynamicPrograming {

	@Test
	public void test() {
		assertEquals(2,solution(3));
	}
	
	@Test
	public void test2() {
		assertEquals(8,solution(6));
	}
	
	@Test
	public void test3() {
		assertEquals(5,solution(5));
	}
	
	@Test
	public void test4() {
		assertEquals(3,solution(4));
	}
	
	@Test
	public void test5() {
		assertEquals(13,solution(7));
	}
	
	
	public int solution(int n) {
	    int[] fib = new int[2]; 
	    fib[0] = 0; 
	    fib[1] = 1;
	    for (int i = 2; i <= n; ++i) 
	        fib[i % 2] = fib[0] + fib[1];
	    
	    return fib[n % 2];
	}

}
