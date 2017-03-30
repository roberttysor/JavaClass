//written to demostrate an understanding of nested loops

public class NestedLoops {
   public static void main (String [] args) {
      int numRows = 2;
      int numCols = 3;

      // Note: You'll need to define more variables

      int rows = 0;
      int cols = 1;
      char col;
      
      while (rows < numRows) {
         
         rows++;
         cols=1;
         col='A';
         
         while (cols <= numCols) {
            
            System.out.print(""+rows+col+" ");
            
            col++;
            cols++;
         }
         
      }   

      System.out.println("");

      return;
   }
}
