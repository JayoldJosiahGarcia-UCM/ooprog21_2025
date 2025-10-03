import javax.swing.*;

class OvertimeGrossPay extends JFrame{

}
class EntryForm extends JFrame{
    /**
     * The employee’s name

    The hours worked

    The hourly rate

    Then compute the employee’s gross pay using these rules:

    If the employee worked 40 hours or less → normal pay (hours × rate).

    If the employee worked more than 40 hours →

    First 40 hours at normal rate

    Extra hours at 1.5 times the hourly rate
     * @param a
     */
    public static void main(String[] a){
        EntryForm frame = new EntryForm();
        frame.setVisible(true);
    }
    public EntryForm(){
       setTitle("Overtime Gross Pay Calculator");
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setLayout(null);

        JLabel nameLabel = new JLabel("Employee Name:");
        JLabel hoursLabel = new JLabel("Hours Worked:");
        JLabel hourlyRateLabel = new JLabel("Hourly Rate:");

        JTextField nameField = new JTextField();
        JTextField hoursField = new JTextField();
        JTextField rateField = new JTextField();

        JButton calculateButton = new JButton ("Calculate Gross Pay");
        JButton clearButton = new JButton("Clear");

        nameLabel.setBounds(50, 30, 120, 25);
        nameField.setBounds(180, 30, 150, 25);
        
        hoursLabel.setBounds(50, 70, 120, 25);
        hoursField.setBounds(180, 70, 150, 25);

        hourlyRateLabel.setBounds(50, 110, 120, 25);
        rateField.setBounds(180, 110,150,25);

        calculateButton.setBounds(80, 160, 100, 30);
        clearButton.setBounds(200, 160, 100, 30);

        add(nameLabel);
        add(nameField);
        add(hoursLabel);
        add(hoursField);
        add(hourlyRateLabel);
        add(rateField);
        add(calculateButton);
        add(clearButton);

        calculateButton.addActionListener(e -> {
            String Ename = nameField.getText().trim();
            String hours = hoursField.getText().trim();
            String rate = rateField.getText().trim();

            double hoursWorked = 0;
            double hourlyRate = 0;

  
            if(Ename.isEmpty() || hours.isEmpty() || rate.isEmpty() ){
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }
            hoursWorked = Double.parseDouble(hours);
            hourlyRate = Double.parseDouble(rate);
            double grossPay = CalculateEmployeeHours(hoursWorked, hourlyRate);

        DisplayForm display = new DisplayForm(Ename, hoursWorked, hourlyRate, grossPay);
            display.setVisible(true);

            
            this.dispose();
        });

        clearButton.addActionListener(e ->{
            nameField.setText("");
            hoursField.setText("");
            rateField.setText("");
        });
    }

    public static double CalculateEmployeeHours(double hoursW, double hoursR){
        double RawWorked = hoursW;
        double RawHours = hoursR;
        double GrossPay = 0;
        if(RawWorked <= 40){
            GrossPay = RawWorked * RawHours;
        }else{
            RawWorked = RawWorked - 40;
            double initial = 40 * RawHours;
            RawWorked = RawWorked * (RawHours *1.5);
            GrossPay = initial + RawWorked;
        }
        return GrossPay;
    }
}

//show total hours overtimed
class DisplayForm extends JFrame{
    public DisplayForm(String Ename, double hoursWorked, double hourlyRate, double grossPay){
        setTitle("Display Frame");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel name = new JLabel("Name:");
        JLabel nameOutput = new JLabel(Ename);

        JLabel hoursWork = new JLabel("Hours Worked:");
        JLabel hoursOutput = new JLabel(String.valueOf(hoursWorked));

        JLabel Rate = new JLabel("Rate:");
        JLabel rateOutput = new JLabel(String.valueOf(hourlyRate));

        JLabel Gross = new JLabel("Gross Pay:");
        JLabel grossOutput = new JLabel(String.valueOf(grossPay));

        name.setBounds(10, 50,120,30);
        nameOutput.setBounds(100, 50,120,30);

        hoursWork.setBounds(10, 70,120,30);
        hoursOutput.setBounds(100, 70,120,30);

        Rate.setBounds(10, 90,120,30);
        rateOutput.setBounds(100, 90,120,30);

        Gross.setBounds(10, 110,120,30);
        grossOutput.setBounds(100, 110,120,30);

        add(name);
        add(nameOutput);
        add(hoursWork);
        add(hoursOutput);
        add(Rate);
        add(rateOutput);
        add(Gross);
        add(grossOutput);

        
    }
}