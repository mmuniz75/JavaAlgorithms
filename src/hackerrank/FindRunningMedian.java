package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FindRunningMedian {
	
	
	@Test
	public void test1() {
		 int[] a = {12,4,5,3,8,7};
		 		 
		 List<Integer> numbers = new ArrayList<>();
		 for(int i=0;i<a.length;i++){
			  int pos = Collections.binarySearch(numbers, a[i]);
	          if (pos < 0) pos = Math.abs(pos)-1;
	          numbers.add(pos, a[i]);
	            
			 double result = 0; 
			 int count = numbers.size();
			 int medium = count/2;
		
			 if(count%2==0)
				 result = (numbers.get(medium-1)+numbers.get(medium))/2.0;
			 else
				 result = numbers.get(medium);
			 
			 System.out.format("%-10.1f%n",result);
		 }
	}
	

		
}
