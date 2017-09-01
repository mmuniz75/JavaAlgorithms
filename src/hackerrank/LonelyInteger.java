package hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LonelyInteger {

	@Test
	public void test() {
		assertEquals(1,solution(new int[]{1}));
	}
	
	@Test
	public void test2() {
		assertEquals(3,solution(new int[]{1,1,3}));
	}
	
	@Test
	public void test3() {
		assertEquals(3,solution(new int[]{3,1,1}));
	}
	
	@Test
	public void test4() {
		assertEquals(2,solution(new int[]{0,0,1,2,1}));
	}
	
	@Test
	public void test5() {
		assertEquals(8,solution(new int[]{1,1,0,0,1,1,0,0,0,0,0,8,0,1,1,1,1,0,0,1,1,0,0,1,1,1,1}));
	}

	
	public int solution(int[] pairs){
		HashSet<Integer> set = new HashSet<>();
		
		Arrays.stream(pairs).forEach(number -> this.storeSet(set, number));
		
		return set.iterator().next();
	}
	
	private void storeSet(Set<Integer> set,int number){
		if(set.contains(number)){
			set.remove(number);
		}else
		   set.add(number);
		
	}
	
}
