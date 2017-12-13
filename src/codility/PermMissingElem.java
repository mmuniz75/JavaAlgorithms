package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PermMissingElem {
	
	@Test
	public void test(){
		int[] numbers = new int[] {2,3,1,5};
		assertEquals(4,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[] {};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[] {2};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[] {1};
		assertEquals(2,solution(numbers));
	}
	
	@Test
	public void test5(){
		int[] numbers = new int[] {2,3,4,5};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test6(){
		int[] numbers = new int[] {2,3,4,1,5};
		assertEquals(6,solution(numbers));
	}
	
	@Test
	public void test7(){
		int[] numbers = new int[] {1,2};
		assertEquals(3,solution(numbers));
	}
	
	@Test
	public void test8(){
		int[] numbers = new int[] {2,3};
		assertEquals(1,solution(numbers));
	}
	
	public int solution(int[] A){
		if(A.length==0)
			return 1;
					
		int missing = 0;
		Arrays.sort(A);
		
		for(int i=1;i<A.length;i++){
			if(A[i]-1 != A[i-1]){
				missing = A[i]-1;
				break;
			}
		}
		
		if(missing==0){
			if (A[0]!=1)
				missing = 1;
			else
				missing = A.length+1;
		}
		
		return missing;
	}

}
