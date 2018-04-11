package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyArrayOperationsTest class
* tests MyArrayOperations class.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayOperationsTest {
	
	//Creating a MyArrayOperations object
	MyArrayOperations mao = new MyArrayOperations();
	//Declaring the expected array
	int array[];
	
	/*
	 * Initializes the integer
	 * array, assigning it the
	 * expected values. 
	 */
	@Before
	public void initializeArray() {
		
		array = new int[] {5, 10, 2, 3, 4, 6, 3, 1, 7};
		
	}
	
	//Default constructor
	public MyArrayOperationsTest() {
		
	}
	
	/*
	 * Tests the gradeFrequencies
	 * method by mocking the 
	 * MyFileUtilities class.
	 */
	@Test
	public void test_gradeFrequencies_mocking() {
		
		MyFileUtilities mfu = mock(MyFileUtilities.class);
		
		when(mfu.readFile("src/test/recourses/grades")).thenReturn(array);
		
		Assert.assertArrayEquals(array, mao.gradeFrequencies("src/test/recourses/grades", mfu));
		
	}

}
