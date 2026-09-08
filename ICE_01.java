
import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        final String customer_number = "223344";
        final String customer_name = "Michael Wells";
        final double base_charge = 16.33;
        final double volume_charge = 0.00253;
        final int number_of_gallons = 7000;

        double water_bill = base_charge + (number_of_gallons * volume_charge);

        JOptionPane.showMessageDialog(null,
            "Water Bill: " +
            "Name: " + customer_name + "\n" +
            "Number: " + customer_number + "\n" +
            "Number of Gallons: " + number_of_gallons + "\n" +
            "Bill Value: $" + water_bill);
    }
}
