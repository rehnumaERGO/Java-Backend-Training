package Day4_OOPS_1;

/*
Problem: Model an insurance policy class with attributes and inheritance for different policy types.
Goal: Understand classes, objects, constructors, and inheritance.
*/
public class InsurancePolicy {
    String policyHolderName;
    double premium;

    InsurancePolicy(String name, double premium) {
        this.policyHolderName = name;
        this.premium = premium;
    }

    void display() {
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Premium: " + premium);
    }
}

// Derived class
class HealthInsurance extends InsurancePolicy {
    int coverageYears;

    HealthInsurance(String name, double premium, int years) {
        super(name, premium);
        this.coverageYears = years;
    }

    void display() {
        super.display();
        System.out.println("Coverage Years: " + coverageYears);
    }
}
