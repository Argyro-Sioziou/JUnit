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
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

@RunWith(Theories.class)
public class MyMathTest_ReverseNumber_Parameterized {
	
	//Creating a MyMath object
	MyMath mm ;
	
	@BeforeClass
	public static void setup(){
		mm = new MyMath();
	}
	
	/*
	 * Creates couples, each
	 * one containing an input
	 * and the expected output 
	 * value.
	 */
	@DataPoints 
	public static int[] data() {
		return new int[]{1,-2,0,Integer.MAX_VALUE};
	}
	
	/*
	 * Test method that
	 * checks if the 
	 * reverseNumber method
	 * returns the correct
	 * output.
	 */
	@Theory
	public void test_reverseNumber(int number) {
		
		Assert.assertEquals(-number, mm.reverseNumber(number));
		
	}
	
}
