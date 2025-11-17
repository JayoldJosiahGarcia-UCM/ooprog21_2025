// Makes String comparisons
import java.util.*;
public class DebugSeven1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String name1, name2, name3;
      System.out.println("Enter three names.");
      System.out.println("They can be the same or different.");
      System.out.print("First name >> ");
      name1 = kb.nextLine();//added parentheses
      System.out.print("Second name >> ");
      name2 = kb.nextLine();//added parentheses
      System.out.print("Third name >> ");
      name3 = kb.nextLine();//adeded parentheses
      compareNames(name1, name2);
      compareNames(name1, name3);
      compareNames(name2, name3);
   }
   public static void compareNames(String n1, String n2)//fixed method name and added datatypes
   {
      System.out.print(n1 + " and " + n2);
      if(n1.equals(n2)){//added a closing parenthesis and a curly brace
         System.out.println(" are the same");}//curly brace added
      else//added curly brace
      {
         System.out.println(" are different");}//added closing curly brace
   }
}
