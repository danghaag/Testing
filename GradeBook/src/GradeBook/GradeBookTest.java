package GradeBook;

import java.util.Scanner;

public class GradeBookTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		// Create GradeBook object
		GradeBook myGradeBook = new GradeBook();
		
		System.out.println( "Please enter the course name:" );
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		myGradeBook.displayMessage( nameOfCourse );
		input.close();
	}

}
