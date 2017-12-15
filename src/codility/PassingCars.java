package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassingCars {
	
	@Test
	public void test(){
		int[] cars = new int[]{0,1,0,1,1};
		assertEquals(5,solution(cars));
	}
	
	public int solution(int[] A){
		int count = 0;
		int countZeros = 0;
		for (int i=0;i<A.length;i++){
			if(A[i]==0) countZeros++; 
			if(A[i]==1) count+=countZeros; 
			if(count>1000000000){
				count = -1;
				break;
			}	
		}	
		
		return count;
	}

}
