import javax.swing.JOptionPane;

class DrivingCalc {
    public static void main(String[] args) {
        String totalMilesInput = JOptionPane.showInputDialog(null, "Enter total miles:");
        double totalMiles = Double.parseDouble(totalMilesInput);

        String costPerGallonInput = JOptionPane.showInputDialog(null, "Enter cost/gallon:");
        double costPerGallon = Double.parseDouble(costPerGallonInput);

        String milesPerGallonInput = JOptionPane.showInputDialog(null, "Enter average miles/gallon:");
        double milesPerGallon = Double.parseDouble(milesPerGallonInput);

        String parkingFeeInput = JOptionPane.showInputDialog(null, "Enter parking fee/day:");
        double parkingFee = Double.parseDouble(parkingFeeInput);

        String tollsInput = JOptionPane.showInputDialog(null, "Enter tolls/day:");
        double tolls = Double.parseDouble(tollsInput);

        double gasUsedPerDay = totalMiles / milesPerGallon;
        double costOfDriving = gasUsedPerDay * costPerGallon + parkingFee + tolls;

        JOptionPane.showMessageDialog(null, "Your daily driving cost as per the driving calculator is: Ksh " + costOfDriving);
    }
}
