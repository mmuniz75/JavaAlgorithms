package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class PermCheck {
	
	@Test
	public void test(){
		int[] numbers = new int[]{4,1,3,2};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{4,1,3};
		assertEquals(0,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
		assertEquals(0,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[]{1,1};
		assertEquals(0,solution(numbers));
	}

	
	
	public int solution(int[] A){
		
		if(A.length==0)
			return 0;
		
		HashSet<Integer> numbers = new HashSet<>();
		for(int a:A)
			numbers.add(a);
		
		if(numbers.size()!=A.length)
			return 0;
		
		Integer[] B = numbers.toArray(new Integer[numbers.size()]);
		
		Arrays.sort(B);
			
		if(B[0]!=1 || B[B.length-1]!=B.length)
			return 0;
		else
			return 1;
	}

}
