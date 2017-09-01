package hackerrank;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class CreamParlor {

	@Test
	public void test() {
		assertArrayEquals(new int[]{1,4},solution(4,new int[]{1,4,5,3,2}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[]{1,2},solution(4,new int[]{2,2,4,3}));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[]{2,3},solution(4,new int[]{4,2,2,3}));
	}
	
	@Test
	public void test4() {
		assertArrayEquals(new int[]{2,4},solution(4,new int[]{4,3,2,1}));
	}
	
	@Test
	public void test5() {
		assertArrayEquals(new int[]{2,3},solution(5,new int[]{1,2,3,4}));
	}
	
	@Test
	public void test6() {
		assertArrayEquals(new int[]{2,3},solution(100,new int[]{5,75,25}));
	}

	
	/*
	 *  100
		3
		5 75 25
		200
		7
		150 24 79 50 88 345 3
		8
		8
		2 1 9 4 4 56 90 3
	 * 
	 */
	
	// this solution not use all the money
	public int[] solution2(int money,int[] flavors){
		int[] bought = new int[2];
				
		for(int i=0;i<flavors.length;i++){
			if( (flavors[i]<money) || (flavors[i]<=money && bought[0]!=0) ){
				if(bought[0]==0)
					bought[0]= i+1;
				else {
					bought[1]= i+1;
					break;
				}
				money-= flavors[i];
			}
		}
		
		Arrays.sort(bought);
		return bought;
		
	}
	
	public int[] solution(int money,int[] flavors){
		int[] bought = null;
			
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<flavors.length;i++){
			int complement = money-flavors[i];
			if(map.containsKey(complement)){
				bought = new int[]{map.get(complement),i+1};
				break;
			}else
				map.put(flavors[i],i+1);
		}
		
		Arrays.sort(bought);
		return bought;
		
	}

}
