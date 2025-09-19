

class DemoGrossPay {
    public static void main(String[] args) {
        double HOURLY_RATE = 22.75;
        double hoursWorked1 = 10;
        double hoursWorked2 = 25;
        double hoursWorked3 = 37.5;

        calculateGross(hoursWorked1, hoursWorked2, hoursWorked3, HOURLY_RATE);
    }    
    public static void calculateGross(double hoursWorked1, double hoursWorked2,double hoursWorked3, double HOURLY_RATE){
        double grossPay1 = hoursWorked1 * HOURLY_RATE;
        double grossPay2 = hoursWorked2 * HOURLY_RATE;
        double grossPay3 = hoursWorked3 * HOURLY_RATE;
        String displayString = hoursWorked1 + " hours at " + HOURLY_RATE + " per hour is " + grossPay1 + "\n"
                             + hoursWorked2 + " hours at " + HOURLY_RATE + " per hour is " + grossPay2 + "\n"
                             + hoursWorked3 + " hours at " + HOURLY_RATE + " per hour is " + grossPay3;
        System.out.println(displayString);
    }
}
