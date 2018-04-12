package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyFileUtilities contains a method that
* reads grades from a text file and returns
* them in the form of an integer array
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class MyFileUtilities {

	//Default constructor
	public MyFileUtilities() {
		
	}
	
	/*
	 * Receives a text file path which contains grades
	 * in the form of String and returns them as an 
	 * integer array
	 * An error while reading he file causes an {@link IllegalArgumentException}
	 * @param filepath the path of the text file
	 * @exception IllegalArgumentException when an error occurs while reading the file
	 * @return 
	 * An int array containing the grades from the text file
	 */
	
	public int[] readFile(String filepath) {
		
		//FileReader declaration
		FileReader fileReader = null;
		
		//BufferedReader declaration
		BufferedReader bufferedReader = null;
		
		//Creation of an ArrayList to save the grades
		List<Integer> grades = new ArrayList<Integer>();
		
		//The grade that was last read
		String grade;
		
		try {
			
			//FileReader creation
			fileReader = new FileReader(filepath);
			
			//Wrapping fileReader in a BufferedReader
			bufferedReader = new BufferedReader(fileReader);
			
			//Reading the text file
			while ((grade = bufferedReader.readLine()) != null) {
				
				grades.add(Integer.parseInt(grade.replaceAll("\\s+","")));
				
			}
			
			//Output array initialization
			int[] output = new int[grades.size()];
			
			//Passing the values from the grades ArrayList to the output array
			for(int i = 0; i < grades.size(); i++) {
				
				output[i] = grades.get(i);
				
			}
			
			fileReader.close();
			bufferedReader.close();
			
			return output;
			
		}  catch (IOException e) {

			throw new IllegalArgumentException("Error while reading the file");
			
		}
		
	}
}
