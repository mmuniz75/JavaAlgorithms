package codility;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Dominator {
	
	@Test
	public void test(){
		int[] numbers = new int[]{3,4,3,2,3,-1,3,3};
		assertEquals(7,solution(numbers));
	}
	
	public int solution(int[] A){
		
		if(A.length==1)
			return 0;
		
		int max = 0;
		int dominator = -1;
		Map<Integer,Integer> counters = new HashMap<>();
		
		for(int i=0;i<A.length;i++){
			if(counters.containsKey(A[i])){
				int value =  counters.get(A[i])+1;
				if(value>max){
					max=value;
					dominator = i;
				}	
				counters.put(A[i],value);
			}else
				counters.put(A[i], 1);
		}
		
		return max>A.length/2?dominator:-1;
	}

}
