package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinPerimeterRectangle {
	
	@Test
	public void test(){
		assertEquals(22,solution(30));
	}
	
	
	
	@Test
	public void test2(){
		assertEquals(4,solution(1));
	}
	
	@Test
	public void test3(){
		assertEquals(126500,solution(1_000_000_000));
	}
	
	@Test
	public void test4(){
		assertEquals(126500,solution2(1_000_000_000));
	}
	

	
	public int solution(int N){
		
		int minPer = Integer.MAX_VALUE;
		for(int A=1;A<=Math.sqrt(N);A++){
			if(N%A==0){
				int B = N/A; 
				int per = 2 * (A+B);
				minPer = Math.min(minPer, per);
			}
			
		}
		
		return minPer;
	}
	
	
	public int solution2(int N){
		
		int A = ((Double)Math.sqrt(N)).intValue();
		int B = 0;
		
		for(int i=A;A>0;A--){
			if(N%A==0){
				B = N/A; 
				break;
			}
		}
		
		return 2 * (A+B);
	}

	/* just for test not a real solution*/
	public int solutionFor30(int N){
		
		int A = ((Double)Math.sqrt(N)).intValue();
		int B = N/A;
		
		return 2 * (A+B);
	}

	@Test
	public void testFor30(){
		assertEquals(22,solutionFor30(30));
	}
	
	@Test
	public void testFor30_1(){
		assertEquals(4,solutionFor30(1));
	}
	
	@Test
	public void testFor30_36(){
		assertEquals(24,solutionFor30(36));
	}
	
	
	
	
}
