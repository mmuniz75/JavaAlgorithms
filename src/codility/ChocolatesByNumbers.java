package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ChocolatesByNumbers {
	
	@Test
	public void test(){
		assertEquals(5,solution(10,4));
	}
	
	@Test
	public void test2(){
		assertEquals(1,solution(1,1));
	}
	
	@Test
	public void test3(){
		assertEquals(1,solution(1,2));
	}
	
	@Test
	public void test4(){
		assertEquals(4,solution(12, 21));
	}
	
	@Test
	public void test5(){
		assertEquals(5,solution(5, 2));
	}
	
	@Test
	public void test6(){
		assertEquals(5,solution(5, 3));
	}
	
	@Test
	public void test7(){
		assertEquals(1,solution(5, 5));
	}
			
	 public int solution(int N, int M){
		 int gcd = gcd(N,M);
		 return N/gcd;		 
	}
	 
	private int gcd(int a, int b) { 
		if(a%b == 0)
			return b;
		else
			return gcd(b,a%b);
	}			 
}
