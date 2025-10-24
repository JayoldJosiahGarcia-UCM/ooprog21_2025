import java.util.*;
class  TradingProfitCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double currentUSDT;
        double profitPercentage;
        boolean tracker = false;
        do{
        System.out.print("Enter your current USDT>>");
        currentUSDT = input. nextDouble();

        System.out.print("Enter the percentage profit you expect per trade>>");
        profitPercentage = input.nextDouble();

        System.out.println("Enter the mode of computation you want>>\n"
                            +"1.Input Day(s) to Compute.\n"
                            +"2.Input Month(s) to Compute.\n"
                            +"3.Input Year(s) to Compute.\n"
                            +"4.Re-input values and Any Number for Exit.");

        int choice = input.nextInt();
        switch(choice){
            case 1:
            System.out.println("The total money you get is " +computeDays(currentUSDT, profitPercentage));
            break;
            case 2:
            System.out.println("The total money you get is " +computeMonth(currentUSDT, profitPercentage));
            break;
            case 3:
            System.out.println("The total money you get is " +computeYear(currentUSDT, profitPercentage));
            break;
            case 4:
            tracker = true;
            break;
            default:
            System.out.println("Exiting..");
            System.exit(0);
            break;
           
        }
            System.out.print("Do you want to compute again? 1 for yes, 2 for no>>");
            int choice2 = input.nextInt();
            if(choice2 == 2){
                tracker = false;
            }
            else{
                tracker = true;
            }
        }while(tracker == true);    
    }
    

    public static Double computeDays(double currentUSDT,double profitPercentage){
        Scanner input1 = new Scanner(System.in);
        double updatedUSDT = currentUSDT;
        profitPercentage = profitPercentage / 100;
        int days = 0;
        System.out.print("Enter the number of days you want to calculate>>");
        days = input1.nextInt();

        for(int i = 0;i < days; i++){
            for(int x = 0;x < 2; x++){
            updatedUSDT += currentUSDT * profitPercentage;
            currentUSDT = updatedUSDT;
            }
        }
        return(updatedUSDT);
    }
    public static Double computeMonth(double currentUSDT,double profitPercentage){
        Scanner input1 = new Scanner(System.in);
        double updatedUSDT = currentUSDT;
        profitPercentage = profitPercentage / 100;
        int Month = 0;
        System.out.print("Enter the number of Month you want to calculate>>");
        Month = input1.nextInt();
        Month = Month * 30;

        for(int i = 0;i < Month; i++){
            for(int x = 0;x < 2; x++){
            updatedUSDT += currentUSDT * profitPercentage;
            currentUSDT = updatedUSDT;
            }
        }
        return(updatedUSDT);
    }
    public static Double computeYear(double currentUSDT,double profitPercentage){
        Scanner input1 = new Scanner(System.in);
        double updatedUSDT = currentUSDT;
        profitPercentage = profitPercentage / 100;
        int Year = 0;
        System.out.print("Enter the number of Year you want to calculate>>");
        Year = input1.nextInt();
        Year = Year * 365;

        for(int i = 0;i < Year; i++){
            for(int x = 0;x < 2; x++){
            updatedUSDT += currentUSDT * profitPercentage;
            currentUSDT = updatedUSDT;
            }
        }
        return(updatedUSDT);
    }
}

