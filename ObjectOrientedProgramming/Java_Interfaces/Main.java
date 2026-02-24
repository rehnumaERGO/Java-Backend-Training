package Java_Interfaces;

/*
Interface = A blueprint for a class that specifies a set of abstract methods, that implementing classes MUST define.
Supports multiple inheritance-like behavior.
*/
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Hawk hawk = new Hawk();
        hawk.hunt();
    }
}
