package Day5_OOPS_2;

/*
Problem: Implement encapsulation with getters/setters and create interfaces for different policy behaviors.
Goal: Learn advanced OOP concepts like abstraction and polymorphism.
*/
public class Main {
    public static void main(String[] args) {
        LifeInsurance policy = new LifeInsurance("Jane Smith", 10000, 65);
        policy.calculatePremium();
        policy.display();
    }
}