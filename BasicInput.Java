// DEFINE package and IMPORT utilities
package basicinput;
import java.util.Scanner;
/**
 *
 * @author RobertTysor
 *  March 18, 2017 
 */
public class BasicInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      //INITIALIZE Scanner for user inputs
      
      int userInt = 0;
      //INITIALIZE integer userInt
      
      double userDouble = 0.0;
      //INITIALIZE double userDouble
      
      char userChar;
      //INITIALIZE character userChar
      
      System.out.println("press ENTER after each submission");
      
      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();
        //GET userInt INPUT
        
      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();
        //GET userDouble INPUT
      
      System.out.println("Enter character: (press ENTER when done)");
      userChar = scnr.next().charAt(0);
        //GET userChar INPUT, limit to first(0) position
      
      System.out.println("Enter String: ");
      String str1 = scnr.next();
        //GET user str1 INPUT
        
      System.out.println(userInt+" "+userDouble+" "+userChar+" "+str1);
        /* FIXED (1) Finish reading other items into variables, 
           then output the four values on a single line separated by a space
        */
      
      System.out.println(str1+" "+userChar+" "+userDouble+" "+userInt);
        // FIXED (2): Output the four values in reverse
      int userDoubleCast = (int) userDouble;
      
      System.out.println(userDouble+" cast to an integer is "+userDoubleCast);
        // FIXME (3): Cast the double to an integer, and output that integer
      
      return;  
        
    }
    
}
