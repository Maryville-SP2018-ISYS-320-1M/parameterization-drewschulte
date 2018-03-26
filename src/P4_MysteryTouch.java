/*
	ISYS 320

	Name(s): Drew Schulte
	Date: March 25
*/

/*
 4. Your output prediction:its going to write 5 lines of touch your --- to you ---- and fill in --- with the words in the string
  
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?) i had the string and object backwards, it I understand this a little better now 
 
 
 */

public class P4_MysteryTouch {
	public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes"; 
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye"; 
        
        touch(ear, elbow);
        touch(elbow, ear); 
        touch(head, "elbow"); 
        touch(eye, eye);
        touch(knees, "Toes"); 
        touch(head, "knees " + knees );
    }
    
    public static void touch(String elbow, String ear) { 
        System.out.println( "touch your " + elbow + " to your " + ear );


}
}
