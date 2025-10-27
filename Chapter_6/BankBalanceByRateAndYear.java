import java.util.Scanner;

class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bankBalance;
        double interestRate = 0.02;
        int years = 1;

        System.out.print("Enter your initial bank balance> ");
        bankBalance = input.nextDouble();

        double initialBalance = bankBalance;

        for(int i =  0; i < 4; i++){
            System.out.println("With an initial balance of " + bankBalance + "at an interest rate of " + interestRate);
            for(int x = 1;x <= 4; x++){
                bankBalance += bankBalance * interestRate;
                System.out.print(" After year " + years + " balance is "+ bankBalance +"\n");
                years++;
                if(x == 4){
                interestRate += 0.01;
                years = 1;
                bankBalance = initialBalance;
            }
            
        }

    }
}
}