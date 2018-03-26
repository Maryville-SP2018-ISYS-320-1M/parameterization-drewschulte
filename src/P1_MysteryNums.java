/*
	ISYS 320

	Name(s):Drew Schulte
	Date: March 25
*/

/*
 1. Your output prediction:it will output the math problem all on a single line 
  
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)No, each sentence is stating a new line, I was thinking you needed a println statement to get to the next line 
 
 
 */
public class P1_MysteryNums {
   public static void main(String[] args) {
        int x = 15;
        sentence( x, 42 );
        
        int y = x - 5;
        sentence( y, x + y);
    }
    
    public static void sentence( int num1, int num2 ) {
        System.out.println( num1 + " " + num2 );
    }
}
