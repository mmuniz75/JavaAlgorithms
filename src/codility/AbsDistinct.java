package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AbsDistinct {
	
	@Test
	public void test(){
		int[] numbers = new int[]{5,-3,-1,0,3,6};
		assertEquals(5,solution(numbers));
	}
	
	public int solution(int[] A){
		Set<Integer> numbers = new HashSet<>();
		for(int a:A)
			numbers.add(Math.abs(a));
		return numbers.size();
	}

}
