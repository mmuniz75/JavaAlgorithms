package codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Fish {
	
	@Test
	public void test(){
		int[] fishs = new int[]{4,3,2,1,5};
		int[] direc = new int[]{0,1,0,0,0};
		assertEquals(2,solution(fishs,direc));
	}
	
	@Test
	public void test2(){
		int[] fishs = new int[]{4,3,2,1,5};
		int[] direc = new int[]{0,1,1,0,0};
		assertEquals(2,solution(fishs,direc));
	}
	
	@Test
	public void test3(){
		int[] fishs = new int[]{4,3,2,1,5};
		int[] direc = new int[]{0,1,1,1,1};
		assertEquals(5,solution(fishs,direc));
	}
	
	@Test
	public void test4(){
		int[] fishs = new int[]{4,3,2,1,5};
		int[] direc = new int[]{1,0,0,0,0};
		assertEquals(1,solution(fishs,direc));
	}
	
	@Test
	public void test5(){
		int[] fishs = new int[]{4,3,7,5,6,8};
		int[] direc = new int[]{1,1,0,1,0,0};
		assertEquals(3,solution(fishs,direc));
	}
	
	@Test
	public void test6(){
		int[] fishs = new int[]{4,3,2,5,6,8};
		int[] direc = new int[]{1,1,0,1,0,0};
		assertEquals(2,solution(fishs,direc));
	}
	
	@Test
	public void test7(){
		int[] fishs = new int[]{9,2,3,5,6,8};
		int[] direc = new int[]{1,1,0,1,0,0};
		assertEquals(1,solution(fishs,direc));
	}
	
	public int solution(int[] A, int[] B){
		int count = 0;
		
		Stack<Integer> previous = new Stack<>();
		for(int i=0;i<A.length;i++){
			if(B[i]==0){
				while(!previous.isEmpty() && A[i] > previous.peek())
					previous.pop();
				
				if(previous.isEmpty())
					count++;
				
			}else
				previous.push(A[i]);
		}
		
		
		return count+previous.size();
				
		
		
	}

}
