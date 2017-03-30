//Basic countdown from userNum.  saving chop for later.

import java.util.Scanner;

public class CountdownRocket {
   public static void main (String [] args) {
      int userNum = 0;
      int i = 0;

      userNum = 3;

      for(i = userNum; i > 0; --i ) {
         System.out.println(i);
         
      }
      System.out.println("Blastoff!");

      return;
   }
}
