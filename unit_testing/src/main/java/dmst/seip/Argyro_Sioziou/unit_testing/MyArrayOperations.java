package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyArrayOperations contains a method 
* that calls the MyFileUtilities readFile 
* method in order to read text file with
* grades and returns their frequencies in 
* the form of an integer array.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

public class MyArrayOperations {
	
	//Default constructor
	public MyArrayOperations() {
		
		
	}
	
	/*
	 * Receives a text file path which contains grades
	 * in the form of String and a MyFileUtilities object
	 * and calls the readFile method on this object so as 
	 * to return the grades frequencies as an integer array.
	 * An error while reading he file causes an {@link IllegalArgumentException}
	 * @param filepath the path of the text file
	 * @param utils a MyFileUtilities object
	 * @exception IllegalArgumentException when an error occurs while reading the file
	 * @return 
	 * An int array containing the grades frequencies from the text file
	 */
	public int[] gradeFrequencies(String filepath, MyFileUtilities utils) {
		
		//Grades are in the range 0 to 10
		int grade_range = 11;
		
		//Creating the frequencies array
		int[] frequencies = new int[grade_range];
		
		//Reading the grades from the file
		int[] grades = utils.readFile(filepath);
		
		//Finding the frequencies
		for(int i = 0; i < grades.length; i++) {
			
			frequencies[grades[i]]++;
			
		}
		
		return frequencies;
		
	}

}
