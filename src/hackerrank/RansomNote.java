package hackerrank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.junit.Test;

import junit.framework.TestCase;

public class RansomNote extends TestCase {
	
	
	@Test
	public void test1() {
		assertTrue(solution("give me one grand today night","give one grand today"));
	}
	
	@Test
	public void test2() {
		assertFalse(solution("two times three is not four","give one grand today"));
	}

	@Test
	public void test3() {
		assertFalse(solution("o l x imjaw bee khmla v o v o imjaw l khmla imjaw x","imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o"));
	}
	
	
	@Test
	public void test4() {
		
		String magazine = "";
		String note = "";
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(this.getClass().getResource("input16.txt").getPath())));
			buffer.readLine();
						
			magazine = buffer.readLine();
			note = buffer.readLine();
			
			buffer.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		assertTrue(solution(magazine,note));
		
	}
	
	private boolean solution(String magazine,String note){
		
				
		StringTokenizer token = new StringTokenizer(magazine," ");
		HashMap<String,Integer> mapMagazine = new HashMap<>();
		
		while(token.hasMoreTokens()) {
			String word = token.nextToken();
			if(mapMagazine.containsKey(word))
				mapMagazine.put(word, mapMagazine.get(word)+1);
			else
				mapMagazine.put(word, 1);
		}
		
		
		token = new StringTokenizer(note," ");
		while(token.hasMoreTokens()) {
			String word = token.nextToken();
			if(mapMagazine.containsKey(word)){
				int count = mapMagazine.get(word)-1;
				if(count==0)
					mapMagazine.remove(word);
				else
					mapMagazine.put(word,count);
			}else
				return false;			
		}
		
		return true;
	}

		
}
