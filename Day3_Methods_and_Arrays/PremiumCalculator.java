package Day3_Methods_and_Arrays;

/*
Problem: Store multiple insurance customer details in arrays and create methods to calculate total premiums.
Goal: Practice organizing data and code modularity.
*/
public class PremiumCalculator {

    // Method to calculate total premiums from an array
    public static double calculateTotalPremium(double[] premiums) {
        double total = 0;
        for (double p : premiums) {
            total += p;
        }
        return total;
    }

    public static void main(String[] args) {
        double[] premiums = { 10000, 12000, 9000, 11000 };
        double totalPremium = calculateTotalPremium(premiums);
        System.out.println("Total premium of all customers: " + totalPremium);
    }
}
