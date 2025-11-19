// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class DebugSeven2
{
public static void main(String[] args)
{
String str;
int x;
int length;
int start = 0;
int num;
int lastSpace = -1;
int sum = 0;
String partStr;
Scanner in = new Scanner(System.in);
System.out.print("Enter a series of integers separated by spaces >> ");
str = in.nextLine();
length = str.length();//fixed len to length
for(x = 0; x < length; ++x)//fixed len to length
{
if(str.charAt(x) == ' ')
{
partStr = str.substring(lastSpace + 1, x);
num = Integer.parseInt(partStr);
System.out.println(" " + num);
sum += num;
lastSpace = x;
}
}
partStr = str.substring(lastSpace + 1, length);
num = Integer.parseInt(partStr);//fixed variable typo
System.out.println(" " + num);
sum += num;//added a + operator before the equal sign
System.out.println(" -------------------" +
"\nThe sum of the integers is " + sum);
}
}
