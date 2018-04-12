# JUnit
A Java application that implements a set of requested operations and their corresponding tests.

# Correspondences
* MyMathTest and MyMathTest_ReverseNumber_Parameterized are test classes for MyMath class (or else just execute the MyMathSuite for both test classes).
* MyFileUtilitiesTest is a test class for MyFileUtilities.
* MyArrayOperationsTest is a test class for MyArrayOperations.

# How it works?

## Get the code ##
* First you have to fork the repository.
* Copy the url of the forked repository and clone it locally.

## Run the tests ##

### Using Eclipse IDE ###
Go to the package explorer and choose the test class you want to run (all test classes can be found on the unit_testing/src/test/java/dmst/seip/Argyro_Sioziou/unit_testing path). Right click on the test you want to execute, "Run as" "JUnit Test". In order to run all the tests together do the same thing by right clicking on the unit_testing folder. 

### Terminal ### 
Change directory and go to the unit_testing folder. To test all classes right the "mvn test" command. To test a specific test class right the "mvn -Dtest=classYouWantToTest test" command and don't forget to replace the classYouWantToTest with the name of the class to be tested. 

Feel free to change the grades from the grades file inside the resources folder and create your own test cases.