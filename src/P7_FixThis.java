/*
	ISYS 320

	Name(s):drew schulte
	Date: march 25
*/

/*
 7. After you fixed the error, why is this an error? Note: do not just repeat Eclipse's error message,
 why did Eclipse have that error message?
 
 Mine ran just fine and didnt have any errors? They go over this on page 99 of the book. They write the code like this
 for (int i = 1; i <= 6; i++) {
 for (int j = 1; j <= i; j++){
 System.out.print("*"); 
 }
 System.out.println();
 }
 
 
 
 */

public class P7_FixThis {

	public static void main(String[] args) {
		for( int line = 0; line < 10; line++ ) {
			int starsToWrite = line % 5 + 1 ;
			writeChar( '*', starsToWrite );
			System.out.println();
		}

	}
	
	public static void writeChar( char characterToPrint, int numOfTimesToPrint  ) {
		for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numOfTimesToPrint; numOfTimesPrinted++ ) {
			System.out.print( characterToPrint );
		}
	}
}
