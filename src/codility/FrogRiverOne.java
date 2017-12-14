package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class FrogRiverOne {
	
	@Test
	public void test(){
		int[] numbers = new int[]{1,3,1,4,2,3,5,4};
		assertEquals(6,solution(5,numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{1,3,5,1,4,2,3,5,4};
		assertEquals(5,solution(5,numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{3};
		assertEquals(-1,solution(5,numbers));
	}
	

	
	public int solution(int X, int[] A){
		HashSet<Integer> numbers = new HashSet<>(); 
		int seconds = -1;
		
		for(int i=0;i<A.length;i++){
			numbers.add(A[i]);
			
			if (numbers.size()==X){
				seconds = i;
				break;
			}
		}
		
		return seconds;
	}

}
