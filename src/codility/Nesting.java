package codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Nesting {
	
	@Test
	public void test(){
		assertEquals(1,solution("(()(())())"));
	}
	
	@Test
	public void test2(){
		assertEquals(0,solution("())"));
	}
	
	public int solution(String S){
		Stack<Character> stack = new Stack<>();
		
		char[] chars = S.toCharArray();
		for(char c:chars){
			
			if(c == '(')
				stack.add(')');
			else{
				if(stack.isEmpty())
					return 0;
				else
					stack.pop();
			}
				
		}
		
		return stack.isEmpty()?1:0;
	}
	
	

}
