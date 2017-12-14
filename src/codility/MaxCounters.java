package codility;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxCounters {
	
	@Test
	public void test(){
		int[] numbers = new int[]{3,4,4,6,1,4,4};
		int[] result = new int[]{3,2,2,4,2};
		assertArrayEquals(result,solution(5,numbers));
		
	}
	
	public int[] solution(int N, int[] A){
		int[] counters = new int[N];
		
		int max = 0;
		int lastMax = 0;
		for(int a:A){
			int posi = a-1;
			if(a<=N){
				if(counters[posi] < max)
					counters[posi] = max + 1;
				else	
					counters[posi]++;
				
				if(counters[posi]>lastMax)
					lastMax = counters[posi]; 
			}else
				max = lastMax;
		}
		
		for(int i=0;i<counters.length;i++)
			if(counters[i]<max)
				counters[i]=max;
		
		return counters;
	}

}
