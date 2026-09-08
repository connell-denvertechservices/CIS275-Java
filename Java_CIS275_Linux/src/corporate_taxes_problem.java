import javax.swing.JOptionPane;

public class corporate_taxes_problem {
    public static void main(String[] args) {
        //1. declare vars & consts
        double revenue, expenses, profit, taxesOwed;
        final double TAX_RATE = .2418;
        String strRevenue, strExpenses, strOutput="";



        //2. Gather inputs
            //get revenue and expenses as strings (Revenue = 1000 )
            //convert strings values to doubles

        strRevenue = JOptionPane.showInputDialog("Your revenues are");
        revenue = Double.parseDouble(strRevenue);
        //Convert String values to doubles
        strExpenses = JOptionPane.showInputDialog("Your expenses are");
        expenses = Double.parseDouble(strExpenses);
        
        //3. Calculate results
            //profit = rev - exp
            //taxes owed = profit * tax_rate
            profit = revenue - expenses;
            taxesOwed = profit * TAX_RATE;

        //3.5 Build an output string
        strOutput = "On a revenue of $" + String.format("%.2f", revenue)
                + " and expenses of $" + String.format("%.2f", expenses)
                + ", a profit of $" + String.format("%.2f", profit)
                + " resulted in $" + String.format("%.2f", taxesOwed)
                + " in taxes owed.";

        //4. Display outputs
        JOptionPane.showMessageDialog(null, strOutput);

    }
}


