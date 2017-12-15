package codility.explain;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.time.Instant;

import org.junit.Test;

public class TimeComplexity {
	
	

	@Test
	public void test(){
		assertEquals(-243309312,solution(1000000000));
	}
	
	@Test
	public void test2(){
		assertEquals(-243309312,solution2(1000000000));
	}
	
	@Test
	public void test3(){
		assertEquals(-243309312,solution2(1000000000));
	}

	public int solution(int N){
		int count = 0;
		for(int i=1;i<=N;i++)
			for(int j=1;j<i+1;j++)
				count+=1;	

		return count;
	}
	
	public int solution2(int N){
		int count = 0;
		for(int i=1;i<=N;i++)
			count+=i;	

		return count;
	}
	
	public int solution3(int N){
		int count = N * (N+1) / 2;
		return count;
	}
	
	

}
