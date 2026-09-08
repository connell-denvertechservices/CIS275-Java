import javax.swing.JOptionPane;

public class SamJessWages {
    public static void main(String[] args) {
        //declare vars and consts
        int samHours, jessHours; 
        final double MIN_WAGE = 11.10; //constant declaration syntx. final -->not changing double
        double samWage, jessWage, totalWage;
        String strSamHours, strJessHours;
        //elicit Sam & Jess hour values

        strSamHours = JOptionPane.showInputDialog("Enter Sam's hours");
        strJessHours = JOptionPane.showInputDialog("Enter Jess's hours");
        //convert the Strings entered to ints
        samHours = Integer.parseInt(strSamHours);
        jessHours = Integer.parseInt(strJessHours);

        //calc wages and results
        samWage = samHours * MIN_WAGE;
        jessWage = jessHours * MIN_WAGE;
        totalWage = samWage + jessWage;
        
        //display outputs
        JOptionPane.showMessageDialog(null,
    "Sam worked " + samHours + " hours and Jess worked " + jessHours + " hours.\n"
    + "Total wages = $" + totalWage );
    }

}
