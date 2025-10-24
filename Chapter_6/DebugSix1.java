// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
public class DebugSix1
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 0;//initialized day to 0
      System.out.print("Enter number of days >> ");//added a semi-colon
      days = keyboard.nextInt();
      while(days > day)//changed the operator from < to >
      {
         money = 2 * money;
         ++day;
         System.out.println("After day " + day + //changed the variable from days to day
            " you have " + money);
      }
   }
}