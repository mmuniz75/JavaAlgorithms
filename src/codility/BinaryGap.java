package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryGap {
	
	
	@Test
	public void test1(){
		assertEquals(2,solution(9));
	}
	
	@Test
	public void test2(){
		assertEquals(4,solution(529));
	}
	
	@Test
	public void test3(){
		assertEquals(1,solution(20));
	}
	
	@Test
	public void test4(){
		assertEquals(0,solution(15));
	}
	
	@Test
	public void test5(){
		assertEquals(0,solution(16));
	}
	
	@Test
	public void test6(){
		assertEquals(0,solution(1024));
	}
	
	@Test
	public void test7(){
		assertEquals(2,solution(51712));
	}
	
	
	public int solution(int N){
		String bin = Integer.toBinaryString(N);
		
		int gap = 0;
		int count = 0;
		boolean hasOne = false;
	
		for(int i=0;i<bin.length();i++){
			char digit = bin.charAt(i);
		
			if(digit == '0' && hasOne)
				count++;
			else{
			    if(count>gap)
					gap = count;
				count=0;
				hasOne = true;
			}	
		}
		
		return gap;
	
	}

}
