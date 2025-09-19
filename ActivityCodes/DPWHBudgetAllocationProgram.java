import javax.swing.JOptionPane;

public class DPWHBudgetAllocationProgram {
    public static void main(String[] args) {
        double TotalBudget = 0;
        double DrainageSystems,RiverDikes,PumpingStations,RoadElevation,EmergencyResponse,Miscellaneous;
        int choice = 0;

        do { 
            try {
                String input = JOptionPane.showInputDialog(null,"Enter the total budget for the flood control projects.");
                if(input == null){
                    JOptionPane.showMessageDialog(null, "System closed.");
                    System.exit(0);
                }
                TotalBudget = Double.parseDouble(input);

                choice = JOptionPane.showConfirmDialog(null, "Is the value entered correct?",
                                                            "Confirm",
                                                            JOptionPane.YES_NO_OPTION);
            } catch (NumberFormatException  | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Budget should not not be empty\n"
                                                    +"                      &\n"
                                                    +"Should not have characters!");
                choice = 1;
                continue;
            }
            if (TotalBudget <= 0){
                JOptionPane.showMessageDialog(null, "Budget should be beyond 0!");
                choice = 1;
            }

        } while (choice == 1);

        DrainageSystems = TotalBudget * 0.25;
        RiverDikes =  TotalBudget * 0.20;
        PumpingStations = TotalBudget * 0.15;
        RoadElevation = TotalBudget * 0.25;
        EmergencyResponse = TotalBudget * 0.10;
        Miscellaneous = TotalBudget * 0.5;

        JOptionPane.showMessageDialog(null, 
                        "DPWH Flood Control Budget Summary\n"+
                        "\n--------------------------------\n"+
                        "Drainage Systems(25%): "+DrainageSystems+ "\n"+
                        "River Dikes(20%): "+RiverDikes+ "\n"+
                        "Pumping Stations(15%): " +PumpingStations+ "\n"+
                        "Road Elevation / Mitigation(25%): " +RoadElevation+ "\n"+
                        "Emergency Response(10%): " +EmergencyResponse+ "\n"+
                        "Miscellaneous(5%): " +Miscellaneous+ "\n"
                        +"--------------------------------");
    }
    public static void Confirmation(int confirmer){
        if(confirmer == 1){
            JOptionPane.showMessageDialog(null,"System is closed.");
            System.exit(0);
            
        }
    
    }
}
