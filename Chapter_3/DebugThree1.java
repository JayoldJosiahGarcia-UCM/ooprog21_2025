
// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
class DebugThree1 //Removed public
{
public static void main(String[] args)//replaced String args[] int String[] args
{
double check1;
double check2;
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of your check >> ");
check1 = input.nextDouble();//replaced input.nextInt() with input.nextDouble()
System.out.print("Enter the amount of your friend's check >> ");
check2 = input.nextDouble();//fixed inputnextInt() into input.nextDouble()
calcTip(check1);
calcTip(check2);
}
public static void calcTip(double bill) //added parameter double bill
{
final double RATE = 0.15;//fixed doubel into double
double tip;
tip = bill * RATE;//changed / into *
System.out.println("The tip should be at least $" + tip);
    }
}
