

import static org.junit.Assert.assertArrayEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

/**
 * Coins : 1c, 5c, 10c, 25c, 50c, U$ 1
 *
 */

public class MoneyChange {

	@Test
	public void test0(){
		assertArrayEquals(new int[]{1,0,0,0,0,4},getChange(5, 0.99D) );
	}
	
	@Test
	public void test2(){
		assertArrayEquals(new int[]{0,0,2,0,0,2},getChange(5, 2.80D) );
	}
	
	@Test
	public void test3(){
		assertArrayEquals(new int[]{0,0,0,1,0,1},getChange(5, 3.75D) );
	}
	
	
	public int[] getChange(int M, double price) {
		
		int[] changes = new int[6];
		double[] coins = new double[]{0.01,0.05,0.10,0.25,0.50};  
		
		double change = M - price;
		
		int intPart = (int)change;
		double rest = new BigDecimal(change - intPart).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
		
		changes[5] = intPart;
		
		for(int i=4;i>=0;i--){
			while(coins[i]<= rest){
				rest-=coins[i];
				changes[i]++;
			}	
			
		}
    	
		return changes;
    }
	

}
