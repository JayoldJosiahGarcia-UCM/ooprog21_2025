import java.util.Scanner;
class BankBalance2public  {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double interestRate = 0.03;
        int year = 1;
        double balance;
        int choice;

        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();

        do{
        balance += balance * interestRate;
        System.out.printf("After year "+ year +" at 0.03    interest rate, balance is "+ balance + "\n");
        System.out.println();
        System.out.println("Do you want to see the balance at the end of another year?");
        System.out.print("Enter 1 for yes\n"
                        + "    or any other number for no >>");
        choice = input.nextInt();
        year++;
        }while(choice == 1);
    }
}
