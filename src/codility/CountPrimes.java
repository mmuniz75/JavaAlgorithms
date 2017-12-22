package codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class CountPrimes {
	
	@Test
	public void test(){
		assertEquals(4,solution(10));
	}
	
	@Test
	public void test2(){
		assertEquals(7,solution(17));
	}
	
		
	private int solution(int n){
		int[] sieve = new int[n+1];
		Arrays.fill(sieve,1);
		sieve[0] = 0;
		sieve[1] = 0;
		
		for(int i=2;i <= Math.sqrt(n);i++){
			if (sieve[i]==1){
				for (int k=i*i;k <= n;k+=i) 
					sieve[k] = 0;
					
			}	
		}
		
		//Arrays.stream(sieve).filter(s -> s==1).toArray();
				
		return (int)Arrays.stream(sieve).filter(s -> s==1).count();
	}

}
