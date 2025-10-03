// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Fries are 89 cents
import java.util.*;
public class DebugFive1
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0;                       //initialized the variable bill to zero
        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.println("3 - Grilled cheese 4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();
        if(usersChoice == 1 || usersChoice == 2)//changed AND(&&) operator to OR(||)
        {                                       //added open and closing curly braces
            bill = bill + HIGH_PRICE;
        }                                       
        else{                                   //added open and closing curly braces
            bill = bill + MED_PRICE;
            System.out.println("Fries with that ? 1 - Yes 2 - No >> ");
            usersChoice = kb.nextInt();
            if(usersChoice == 1){               //added open and closing curly braces and added an additional equal sign
                bill = bill + LOW_PRICE;
            }
        }
            System.out.println("Total bill is " + bill); //added double quotations inside the print
            
        
    }
}