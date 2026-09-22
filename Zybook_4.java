import java.util.Scanner;

public class Zybook_4 {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userValue;
      int maxNumber;

      userValue = scnr.nextInt();
      maxNumber = userValue;

      while (userValue > 0) {
         if (userValue > maxNumber) {
            maxNumber = userValue;
         }

         userValue = scnr.nextInt();
      }

      System.out.print("Max value: " + maxNumber);
   }
}