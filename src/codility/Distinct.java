package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Distinct {
	
	@Test
	public void test(){
		int[] numbers = new int[]{2,1,1,2,3,1};
		assertEquals(3,solution(numbers));
	}
	
	public int solution(int[] A){
		Set<Integer> numbers = new HashSet<>();
		for(int a:A)
			numbers.add(a);
			
		return numbers.size();
	}

}
