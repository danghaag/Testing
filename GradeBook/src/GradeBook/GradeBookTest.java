package GradeBook;

public class GradeBookTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			
		// Create GradeBook object
		GradeBook myGradeBook = new GradeBook("Dan's Class");
		
		myGradeBook.displayMessage();
		myGradeBook.determineClassAverage();
	}

}
