package codility;

import static org.junit.Assert.*;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class CountDiv {
	
	@Test
	public void test(){
		assertEquals(3,solution(6,11,2));
	}
	
	@Test
	public void test3(){
		assertEquals(4,solution(2,8,2));
	}
	
	@Test
	public void test4(){
		assertEquals(8,solution(0, 14, 2));
	}
	
		
	@Test
	public void test2(){
		Instant start = Instant.now();
		int divs = solution(0, 2000000000, 1);
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		
		double cel = Math.ceil(duration.toMillis()/1000.0);
		
		assertTrue("expeted 0.10 s takes " + cel + " s",cel<=0.10);
		
		assertEquals(2000000001,divs);
	}
	
	public int solution(int A, int B, int K){
		return solution2(A,B,K);
		//return (B==0) ? 1 : B/K + ( (A==0) ? 1 : (-1)*(A-1)/K);
	}
	
	public int solution2(int A, int B, int K){
		if (B==0) 
			return 1;
		
		int divs = 0;
		
		if (A==0)
			divs = B/K + 1;
		else
			divs = B/K - (A-1)/K;
	
		return divs;
	
	}

}
