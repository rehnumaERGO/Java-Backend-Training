package Day9_Functional_Programming;

public class Customer {
    String name;
    double premium;

    public Customer(String name, double premium) {
        this.name = name;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return name + " -> " + premium;
    }
}
