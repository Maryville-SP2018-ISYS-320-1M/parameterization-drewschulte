/*
	ISYS 320
	Name(s):drew schulte
	Date: march 25
*/

public class CountGrid {

	public static void main(String[] args) {
	for (int x = 0; x < 4; x++) {
		for (int y = 0; y < 6; y++) {
			printGridCell(x, y);
		}
		System.out.println();
	}
	}

	private static void printGridCell(int x, int y) {
		System.out.print(" " + (x*x + y) + " " );
		
	}}

