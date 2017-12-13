package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class OddOccurrencesInArray {
	
	
	@Test
	public void test(){
		int[] numbers = new int[]{9,3,9,3,9,7,9};
		assertEquals(7,solution(numbers));                        
	}
	
	public int solution(int[] A){
		HashSet<Integer> numbers = new HashSet<>();
		
		for(int a:A){
		   if(!numbers.contains(a))
			   numbers.add(a);
		   else
			   numbers.remove(a);
		}
		
		return numbers.isEmpty()?0:numbers.iterator().next();
	}

}
