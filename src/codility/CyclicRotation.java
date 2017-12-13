package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotation {
	
	@Test
	public void test(){
		int [] A = new int[]{3, 8, 9, 7, 6};
		int K = 3;
		int [] result = new int[]{9, 7, 6, 3, 8};
		
		assertArrayEquals(result,solution(A,K));
	}
	
	@Test
	public void test2(){
		int [] A = new int[]{};
		int K = 3;
		int [] result = new int[]{};
		
		assertArrayEquals(result,solution(A,K));
	}
	
	public int[] solution(int[] A, int K){
		
		if(A.length==0)
			return A;
			
		for (int i=0;i<K;i++){
			int last = A[A.length-1];
			for(int j=A.length-1;j>0;j--){
				A[j] = A[j-1];
			}
			A[0] = last;
		}
		
		return A;
	}
	
	

}
