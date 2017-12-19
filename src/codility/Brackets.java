package codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Brackets {
	
	@Test
	public void test(){
		String s = "{[()()]}";
		assertEquals(1,solution(s));
	}
	
	@Test
	public void test2(){
		String s = "([)()]";
		assertEquals(0,solution(s));
	}
	
	
	public int solution(String S){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<S.length();i++){
			char c = S.charAt(i);
			switch (c){
				case '{' :
					stack.push('}');
					break;
				case '[' :
					stack.push(']');
					break;
				case '(' :
					stack.push(')');
					break;
				default :
					if(stack.isEmpty() || stack.peek()!=c)
						return 0;
					else
					 	stack.pop();
			}
		}
		return stack.isEmpty()?1:0;
	}

}
