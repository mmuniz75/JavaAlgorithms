package hackerrank;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

import junit.framework.TestCase;

public class MakingAnagrams extends TestCase {
	
	
	@Test
	public void test1() {
		assertEquals(4,numberNeeded2("cde","abc"));
	}
	
	@Test
	public void test2() {
		assertEquals(0,numberNeeded2("bacdc","dcbac"));
	}
	
	@Test
	public void test3() {
		assertEquals(30,numberNeeded2("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}
	
	
	
	public static int numberNeeded2(String first, String second) {
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
	
		
  public static int numberNeeded(String first, String second) {
  
	  
	  HashMap<Character,Integer> firtMap = convertCharsHash(first);
	  HashMap<Character,Integer> secondMap = convertCharsHash(second);
	  
	  int deletions = getAnagramDeletion(firtMap,secondMap);
	  deletions += getAnagramDeletion(secondMap,firtMap);
	  
	  return deletions; 
  }

  
  private static HashMap<Character,Integer> convertCharsHash(String value){
	  HashMap<Character,Integer> map = new HashMap<>();
	  
	  for(char letter:value.toCharArray()){
		  if(map.containsKey(letter))
			  map.put(letter, map.get(letter)+1);
		  else
			  map.put(letter,1);
	  }
	  
	  return map;
  }
  
  private static int getAnagramDeletion(HashMap<Character,Integer> strings1,HashMap<Character,Integer> strings2){
	  strings1 = (HashMap<Character,Integer>)strings1.clone();
	  strings2 = (HashMap<Character,Integer>)strings2.clone();
	  
	  Iterator<Character> it = strings1.keySet().iterator(); 
	  while(it.hasNext()){
		  char letter = it.next();
		  if(strings2.containsKey(letter)){
			  int countLetter = strings2.get(letter)-strings1.get(letter);
			  if(countLetter==0)
				  strings2.remove(letter);
			  else
				  strings2.put(letter, countLetter);
		  }
	  }
	  
	  
	  int count = 0;
	  
	  for(int i:strings2.values())
		  count+=i;
	  
	  return count;
	  
  }
  
  
  
		
}
