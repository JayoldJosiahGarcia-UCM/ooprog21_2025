import javax.swing.JOptionPane;

class PracticeGrossPay{
    public static void main(String[] a){
        double TotalHours = inputHoursWorked();
        double HourRate = ConfirmHourlyRate();
        double NetTotal = NetGrossTotal(HourRate, TotalHours);
        displayOutput(NetTotal);
    }
    public static double inputHoursWorked(){
        String TotalHoursWorked = JOptionPane.showInputDialog(null,
                                                            "Enter how many hours you've worked"
                                                            );
        
        double FinalHoursWorked = 0;

        try {
            if(TotalHoursWorked.isEmpty()){
                JOptionPane.showMessageDialog(null, "Invalid Input");
                System.exit(0);

            }
 
            FinalHoursWorked = Double.parseDouble(TotalHoursWorked);

        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Invalid Input");
                 System.exit(0);
        }
        return FinalHoursWorked;
    }
    public static double ConfirmHourlyRate(){
        int Confirmation = JOptionPane.showConfirmDialog(null,
                                                         "Would you like to enter your hourly rate?",
                                                         "Confirm",
                                                         JOptionPane.YES_NO_OPTION
                                                         );
        
        if(Confirmation == 0){
           return getHourlyRate();
        }
        else{
           return getHourlyRateStatic();
        }
    
    }

    public static double getHourlyRate(){
        String RawHourlyRate = JOptionPane.showInputDialog(null, "Enter your hourly rate: ");

        double HourlyRateValue = 0;
        try {
            if(RawHourlyRate.isEmpty()){
                JOptionPane.showMessageDialog(null, "Invalid Input!");
                System.exit(0);
            }
        HourlyRateValue = Double.parseDouble(RawHourlyRate);    
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
                System.exit(0);
        }
        return HourlyRateValue;
    }

    public static double getHourlyRateStatic(){
        double HourlyRateValue = 20;
        return HourlyRateValue;
    }

    public static double NetGrossTotal(double HourlyRateValue, double TotalHours){
        double TotalNetGross = HourlyRateValue * TotalHours;
        return TotalNetGross;
    }

    public static void displayOutput(double NetGrossFinal){
        JOptionPane.showMessageDialog(null, "Net Gross Pay: $" +NetGrossFinal);
    }
    }


