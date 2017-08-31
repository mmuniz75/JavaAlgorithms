package hackerrank;

import java.util.Stack;

import org.junit.Test;

import junit.framework.TestCase;

public class BalancedBrackets extends TestCase {
	
	
	@Test
	public void test1() {
		assertTrue(isBalanced("{[()]}"));
	}
	
	@Test
	public void test2() {
		assertFalse(isBalanced("{[(])}"));
	}
	
	@Test
	public void test3() {
		assertTrue(isBalanced("{{[[(())]]}}"));
	}
	
	
	public static boolean isBalanced(String expression) {
		if ((expression.length() & 1) == 1) 
			return false;
		else {
	        char[] chars = expression.toCharArray();
	        Stack<Character> stack = new Stack<>();
	        for(char c:chars)	        	
	        	switch (c) {
	        		case '{' : stack.push('}');break;
	        		case '[' : stack.push(']');break;
	        		case '(' : stack.push(')');break;
	        		default :
	        			if(stack.empty() || c!=stack.peek())
	        				return false;
	        			stack.pop();
	        	}
	        	
	      return stack.empty();  	
	     }
     
    }
		
}
