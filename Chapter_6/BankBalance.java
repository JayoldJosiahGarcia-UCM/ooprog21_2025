import java.util.Scanner;

class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();
        

            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any number for no >>");

        int choice = scanner.nextInt();
        int year = 1;
        
        while(choice == 1){
            balance += balance * 0.03;

            System.out.printf("After year "+ year +" at 0.03 interest rate, balance is "+ balance + "\n");
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any number for no >>");
            choice = scanner.nextInt();
            if(choice != 1){
                break;
            }
            year++;
       }
        

    }
}
