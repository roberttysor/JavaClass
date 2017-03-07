# JavaClass
My assignment work from entry level java class

/* I will be committing chops of code and small programs 
  As I learn through Intro to Web Application Development
  based in Java */
  
/*Basic Output with Variables in java.
  Generates scanners for two user inputs (variables)
  and outputs variables
  -squared
  -cubed
  -add variables
  -multiply variables
*/  

import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum2 = 0;

      System.out.println("Enter integer: "); //took out sample numbers
      userNum = scnr.nextInt();
      System.out.println("You entered: "+userNum);
      System.out.println(userNum+" squared is "+(userNum * userNum));
      System.out.println("And " +userNum+ " cubed is " +(userNum * userNum * userNum)+"!!");
      
      System.out.println("Enter another integer: ");//took out sample numbers
      userNum2 = scnr.nextInt();
      System.out.print(userNum+" + "+userNum2+" is ");
      System.out.println(userNum+userNum2);
      System.out.print(userNum+" * "+userNum2+" is ");
      System.out.println(userNum*userNum2);
      
      
      
      
      
      return;
   }
}
