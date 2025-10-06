import java.util.Scanner;

class Payroll {
    public static void main(String [] a){
        
        Scanner input =  new Scanner(System.in);
        
        System.out.println("How many hours did you work this week?");
        double hours = input.nextDouble();

        System.out.println("What is your regular pay rate?");
        double rate = input.nextDouble();

        Employee emp = new Employee(hours, rate);

        System.out.println("Regular Pay is " + emp.calculateRegularPay());
        System.out.println("Overtime Pay is " + emp.calculateOvertimePay());
    }
}
