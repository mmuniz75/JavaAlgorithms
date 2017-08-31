package hackerrank;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayLeftRoration {
	
	
	@Test
	public void test1() {
		test(1,new int[]{1,2,3,4,5},new int[]{2,3,4,5,1});
	}
	
	@Test
	public void test2() {
		test(2,new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});
	}
	
	@Test
	public void test3() {
		test(3,new int[]{1,2,3,4,5},new int[]{4,5,1,2,3});
	}
	
	@Test
	public void test4() {
		test(4,new int[]{1,2,3,4,5},new int[]{5,1,2,3,4});
	}
	
	@Test
	public void test0() {
		test(0,new int[]{1,2,3,4,5},new int[]{1,2,3,4,5});
	}
	
	@Test
	public void testEmpty() {
		test(0,new int[]{},new int[]{});
	}
	
	private void test(int times,int[] array,int[] expected) {
		int[] resultArray = solution(times,array);
		boolean test = Arrays.equals(expected,resultArray) ; 
		String message = "Expected : " + Arrays.toString(expected) + " but was : " + Arrays.toString(resultArray); 
		assertTrue(message,test);
	}

	
	private int[] solution(int k,int[] a){
				
		for(int i=0;i<k;i++){
			int first = a[0];
			for(int j=1;j<a.length;j++){
				a[j-1]=a[j];
			}
			a[a.length-1] = first;
		}
	
		String resultString = Arrays.toString(a).replaceAll(",","");
		System.out.println(resultString.substring(1,resultString.length()-1));
		
		return a;
	}
	
}
