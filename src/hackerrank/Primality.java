package hackerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class Primality {

	@Test
	public void test() {
		assertArrayEquals(new String[]{"Prime","Not Prime","Not Prime","Not Prime"}, solution(new int[]{2,-1,0,1}));	}
	
	@Test
	public void test2() {
		assertArrayEquals(new String[]{"Not Prime","Prime","Prime"}, solution(new int[]{12,5,7}));	}
	
	@Test
	public void test3() {
		assertArrayEquals(new String[]{"Prime","Prime","Not Prime"}, solution(new int[]{11,13,33}));	}
	
	@Test
	public void test4() {
		assertArrayEquals(new String[]{"Prime","Not Prime","Prime"}, solution(new int[]{1000000007,100000003,1000003}));	}
			
	
	public String[] solution(int[] numbers){
		String[] primes = new String[numbers.length];
		
		for(int i=0;i<numbers.length;i++){
			primes[i] = checkPrime(numbers[i]);
		}
		
		return primes;
	}
	
	
	private String checkPrime(int number){
		boolean result = true;;
		
		if(number<2 || (number!=2 && number%2==0) || (number!=5 && number%5==0)) 
			result = false;
		
		if(result && number!=2 && number!=5){
			for(int i=3;i<=Math.sqrt(number);i++){
				if(number!=i && number%i == 0){
					result = false;
					break;
				}	
			}
			
		}
		
		return result?"Prime":"Not Prime";
	}

}
