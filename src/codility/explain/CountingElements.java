package codility.explain;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CountingElements {

	
	@Test
	public void test_soltion1(){
		int A[] = new int[]{6,2,9,1,5,2}; //25
		int B[] = new int[]{8,1,2,8,3,0}; //22
		
		assertEquals(false,solution(A,B,9));
	}
	
	
	@Test
	public void test(){
		int A[] = new int[]{6,2,9,1,5,2}; //25
		int B[] = new int[]{8,1,2,8,3,0}; //22
		
		assertEquals(false,solution2(A,B,9));
	}
	
	@Test
	public void test2(){
		int A[] = new int[]{6,2,8,1,5,2}; //24
		int B[] = new int[]{8,1,2,8,3,0}; //22
		
		assertEquals(true,solution2(A,B,8));
	}

	
	@Test
	public void test3(){
		int A[] = new int[]{6,2,8,1,5,2}; //24
		int B[] = new int[]{8,1,2,8,3,0}; //22
		
		assertEquals(true,solution2(B,A,8));
	}
	
	@Test
	public void test4(){
		int A[] = new int[]{2,2,3,4,6}; //17
		int B[] = new int[]{5,7,8,9,0}; //29
		
		assertEquals(true,solution2(B,A,9));
	}
	
	@Test
	public void test5(){
		int A[] = new int[]{2,2,3,4,6}; //17
		int B[] = new int[]{5,7,8,9,0}; //29
		
		assertEquals(true,solution(B,A,9));
	}
	
	
	public boolean solution(int[] A,int[] B,int M){
		
		int sumA = Arrays.stream(A).sum();
		int sumB = Arrays.stream(B).sum();
	
		for(int a:A) {
			for(int b:B){
				int dif = b-a;
				sumA +=dif;
				sumB -=dif;
				if (sumA == sumB)
					return true;
				sumA -=dif;
				sumB +=dif;
			}
		}
		
		return false;
		
	}
	
	public boolean solution2(int[] A,int[] B,int M){
			
		int sumA = Arrays.stream(A).sum();
		int sumB = Arrays.stream(B).sum();
		int d = sumA - sumB;
		
		if(d % 2 == 1)
			return false;
		
		d /= 2;
		
		int[] count = new int[M+1];
		for(int a:A)
			count[a]++;
				
		for(int i=0;i<B.length;i++){
			int dif = B[i] - d;
			if (dif <= M && dif >=0 && count[dif] > 0)
				return true;
		}
		
		return false;
		
	}
	
	
}
