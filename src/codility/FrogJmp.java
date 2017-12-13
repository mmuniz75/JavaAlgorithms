package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogJmp {
	
	@Test
	public void test(){
		assertEquals(3,solution(10,85,30));
	}
	
	public int solution(int X, int Y, int D){
		double x = X;
		double y = Y;
		double d = D;
		Double value = Math.ceil((y-x)/d);
		return value.intValue();
	}

}
