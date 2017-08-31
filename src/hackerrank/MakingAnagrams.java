package hackerrank;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MakingAnagrams {
	
	
	@Test
	public void test1() {
		assertEquals(4,numberNeeded("cde","abc"));
	}
	
	@Test
	public void test2() {
		assertEquals(0,numberNeeded("bacdc","dcbac"));
	}
	
	@Test
	public void test3() {
		assertEquals(30,numberNeeded("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}
	
	
	
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}
	

  
  
		
}
