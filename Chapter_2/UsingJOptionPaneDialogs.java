import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs{
    public static void main(String[] args) {
    
    String userName = "";
    int confirmation;

        do { 
        userName = JOptionPane.showInputDialog(null,"What's your name?");

        
        confirmation = JOptionPane.showConfirmDialog(null,"Do you want to confirm your name?",
                                                          "Confirm",
                                                          JOptionPane.YES_NO_OPTION);
        } while (confirmation == 1);

        JOptionPane.showMessageDialog(null,"Hello, "+userName+"!");

    }
}