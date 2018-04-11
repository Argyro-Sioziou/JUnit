package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyMath contains two methods, 
* the first divides two integers
* and the second finds an integer's
* opposite number.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

public class MyMath {
	
	//Default constructor
	public MyMath() {
		
	}
	
	/*
	 * Receives two integer numbers and executes the 
	 * mathematical operation division using the first
	 * as the numerator and the second the denominator.
	 * A zero denominator causes an {@link IllegalArgumentException}
	 * @param num the integer numerator
	 * @param denom the integer denominator
	 * @exception IllegalArgumentException when denominator is 0
	 * @return 
	 * The result of the division of num by denom
	 */
	
	public double divide(int num, int denom) {
		
		//Checks if the denom value is valid
		if(denom == 0) {
			
			throw new IllegalArgumentException("'denominator' cannot be zero");
			
		} 
		
		return (double)num/denom;
		
	}
	
	/*
	 * Receives an integer number and returns 
	 * its opposite.
	 * @param number the integer number
	 * @return 
	 * The opposite of the int number
	 */
	
	public int reverseNumber(int number) {
		
		if(number == 0) {
			
			return 0;
			
		} else {
			
			return number*(-1);
		}
	}

}
