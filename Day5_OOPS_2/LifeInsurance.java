package Day5_OOPS_2;

public class LifeInsurance extends InsurancePolicy implements Policy {
    private int age;

    public LifeInsurance(String name, double premium, int age) {
        super(name, premium);
        this.age = age;
    }

    public void calculatePremium() {
        if (age > 60) {
            setPremium(getPremium() * 1.2); // 20% increase for seniors
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Age: " + age);
    }
}