public class Employee {
    
    public static final int MaxEmpolyeeNumber = 9999;
    public static final double MaxRate = 60.00;
    public static final double OvertimeRate = 1.5;
    
    private double hoursWorked;
    private double payRate;
    private double overTimeHours;

    public Employee(double hours, double rate){
        if(hours < 0){
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        if(rate < 0 || rate > MaxRate){
            throw new IllegalArgumentException("Pay rate should be between 0 and " + MaxRate);
        }
        
        hoursWorked = hours;
        payRate = rate;
        
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public double getPayRate(){
        return payRate;
    }

    public double getOverTimeHours(){
        return overTimeHours;
    }

    public double calculateRegularPay(){
        if(hoursWorked < 40){
            return hoursWorked * payRate;
        }
        else{
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay(){
        if(hoursWorked >= 40){
            overTimeHours = hoursWorked - 40;
            return overTimeHours * payRate * OvertimeRate;
        }
        else{
            return 0;
        }
    }
}
