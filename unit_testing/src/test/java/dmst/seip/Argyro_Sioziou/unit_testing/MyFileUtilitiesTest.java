package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyFileUtilitiesTest class
* tests the MyFileUtilities 
* class.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Assert;

public class MyFileUtilitiesTest {
	
	//Declaring the expected array
	int array[];
	//Creating a MyFileUtilities object
	MyFileUtilities  mfu = new MyFileUtilities();
	
	/*
	 * Initializes the integer
	 * array, assigning it the
	 * expected values. 
	 */
	@Before
	public void initializeArray() {
		
		array = new int[] {5, 10, 2, 3, 4, 6, 3, 1, 7};
		
	}
	
	/*
	 * Test method that
	 * checks if the
	 * readFile method
	 * creates the 
	 * correct array.
	 */
	@Test
	public void normal_case() {
		
		Assert.assertArrayEquals(array, mfu.readFile("src/test/resources/grades"));
		
	}
	
	/*
	 * Creating a rule
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * Test method that
	 * checks if the
	 * readFile method
	 * throws the right
	 * exception if the
	 * input path is wrong.
	 */
	@Test
	public void no_file_Exception() {
		
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("wrongName");
		
	}
	
}
