package Day2_Control_Statements;

/*
Problem: Determine insurance eligibility and premium discounts using if-else and loops for multiple customers.
Goal: Practice decision making and repeating tasks in code.
*/
public class InsuranceEligibility {
    public static void main(String[] args) {
        int[] customerAges = { 22, 30, 45, 18 };
        double basePremium = 10000;

        for (int age : customerAges) {
            if (age < 18) {
                System.out.println("Age " + age + ": Not eligible for insurance");
            } else if (age < 25) {
                System.out.println("Age " + age + ": Premium with 20% surcharge = " + basePremium * 1.2);
            } else {
                System.out.println("Age " + age + ": Standard premium = " + basePremium);
            }
        }
    }
}
