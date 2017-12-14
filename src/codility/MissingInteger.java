package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MissingInteger {
	
	@Test
	public void test(){
		int[] numbers = new int[]{1, 3, 6, 4, 1, 2};
		assertEquals(5,solution(numbers));
	}
	
	@Test
	public void test2(){
		int[] numbers = new int[]{1, 2, 3};
		assertEquals(4,solution(numbers));
	}
	
	@Test
	public void test3(){
		int[] numbers = new int[]{-1,-3};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test4(){
		int[] numbers = new int[]{1,2,2};
		assertEquals(3,solution(numbers));
	}
	
	@Test
	public void test5(){
		int[] numbers = new int[]{2};
		assertEquals(1,solution(numbers));
	}
	
	@Test
	public void test6(){
		int[] numbers = new int[]{4,3,5,6};
		assertEquals(1,solution(numbers));
	}
	
	
	public int solution(int[] A){
		Set<Integer> numbers = new HashSet<>();
		for(int a:A)
			numbers.add(a);
		
		int min = 1;
		while(numbers.contains(min))
			min++;
		
		return min;
	}

}
