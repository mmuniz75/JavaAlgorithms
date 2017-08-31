package hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciNumbers {

	@Test
	public void test() {
		assertEquals(2,fibonacci(3));
	}
	
	@Test
	public void test2() {
		assertEquals(8,fibonacci(6));
	}
	
	@Test
	public void test3() {
		assertEquals(5,fibonacci(5));
	}
	
	@Test
	public void test4() {
		assertEquals(3,fibonacci(4));
	}
	
	@Test
	public void test5() {
		assertEquals(13,fibonacci(7));
	}
	
	
	public static int fibonacci(int n) {
	    int[] fib = new int[2]; 
	    fib[0] = 0; fib[1] = 1;
	    for (int i = 2; i <= n; ++i) {
	        fib[i % 2] = fib[0] + fib[1];
	        System.out.println("fibonacci(" + i + ") = " + fib[i % 2]);
	    }
	    return fib[n % 2];
	}

}
