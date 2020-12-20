package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyMathTest class 
* contains the tests for
* the divide method of
* MyMath class.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import org.junit.Test;
import static org.junit.Assert;

public class MyMathTest {
	
	//Creating a MyMath object
	MyMath myMath = new MyMath();
	
	/*
	 * Test method that
	 * checks if divide
	 * method calculates 
	 * correctly an 
	 * integer result.
	 */
	@Test
	public void test_integer_result() {
		
		assertEquals(2, myMath.divide(10, 5), 0.1);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method calculates 
	 * correctly a 
	 * double result.
	 */
	@Test 
	public void test_double_result() {
		
		assertEquals(3.64, myMath.divide(80, 22), 0.1);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method works 
	 * correctly with 
	 * a zero numerator.
	 */
	@Test 
	public void test_zero_numerator() {
		
		assertEquals(0, myMath.divide(0, 5), 0);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method returns
	 * the right sign 
	 * with a negative
	 * numerator.
	 */
	@Test
	public void test_negative_numerator() {
		
		assertEquals(-1, myMath.divide(-5, 5), 0.1);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method returns
	 * the right sign
	 * with a negative
	 * denominator.
	 */
	@Test
	public void test_negative_denominator() {
		
		assertEquals(-1, myMath.divide(5, -5), 0.1);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method returns
	 * the right sign
	 * when both integers
	 * are negative.
	 */
	@Test
	public void test_negative_both() {
		
		assertEquals(1, myMath.divide(-5, -5), 0.1);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method returns
	 * the right exception
	 * in the zero to zero
	 * case.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_zero_to_zero() {
		
		myMath.divide(0, 0);
		
	}
	
	/*
	 * Test method that
	 * checks if divide
	 * method returns
	 * the right exception
	 * when the denominator
	 * is zero.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_zero_denominator() {
		
		myMath.divide(5, 0);
		
	}
	
}
