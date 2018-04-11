package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyMathTest_ReverseNumber_Parameterized
* class contains parameterized tests
* for the reverseNumber method of
* the MyMath class.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {

	//Setting the first parameter's value
	@Parameter (value = 0)
	public int number;
	
	//Setting the second parameter's value
	@Parameter (value = 1)
	public int opposite;
	
	//Creating a MyMath object
	MyMath mm = new MyMath();
	
	/*
	 * Creates couples, each
	 * one containing an input
	 * and the expected output 
	 * value.
	 */
	@Parameters 
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{1, -1}, {-2, 2}, {0, 0}, {Integer.MAX_VALUE, -Integer.MAX_VALUE}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * Test method that
	 * checks if the 
	 * reverseNumber method
	 * returns the correct
	 * output.
	 */
	@Test
	public void test_reverseNumber() {
		
		Assert.assertEquals(opposite, mm.reverseNumber(number));
		
	}
	
}
