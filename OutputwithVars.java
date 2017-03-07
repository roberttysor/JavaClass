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
