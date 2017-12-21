package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountFactors {
	
	@Test
	public void test(){
		assertEquals(8,solution(24));
	}
	
	@Test
	public void test2(){
		assertEquals(2,solution(Integer.MAX_VALUE));
	}
	
	@Test
	public void test3(){
		assertEquals(1,solution(1));
	}
	
	@Test
	public void test4(){
		assertEquals(2,solution(2));
	}
	
	@Test
	public void test5(){
		assertEquals(2,solution(3));
	}
	
	@Test
	public void test6(){
		assertEquals(3,solution(4));
	}
	
	@Test
	public void test7(){
		assertEquals(3,solution(25));
	}
	
		
	public int solution(int N){
		int count =0;
		
		for (int i=((Double)Math.sqrt(N)).intValue();i>0;i--){
			if(N%i==0){
				if(N/i==i){
					count++;
				}else
					count+=2;
				
			}
		}
		
		return count;
	}
	
	

}
