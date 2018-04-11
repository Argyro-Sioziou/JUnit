package dmst.seip.Argyro_Sioziou.unit_testing;

/**
* The MyMathSuite is a Suite class
* which groups MyMathTest and 
* MyMathTest_ReverseNumber_Parameterized
* classes, which contain all the tests
* for the MyMath class.
* 
* @author  Sioziou Argyro
* @version 1.0
* @since   2018-04-11 
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathTest_ReverseNumber_Parameterized.class})
public class MyMathSuite {

	/*
	 * This class remains empty. Is
	 * only used as a holder of the
	 * above annotations.
	 */
	
}
