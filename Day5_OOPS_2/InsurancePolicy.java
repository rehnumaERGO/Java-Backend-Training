package Day5_OOPS_2;

public class InsurancePolicy {
    private String policyHolderName;
    private double premium;

    public InsurancePolicy(String name, double premium) {
        this.policyHolderName = name;
        this.premium = premium;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public void display() {
        System.out.println("Policy Holder: " + policyHolderName + ", Premium: " + premium);
    }
}
