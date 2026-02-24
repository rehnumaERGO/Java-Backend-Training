package Inheritance;

/*
Inheritance = One class inherits the attributes and methods from another class.
child<- parent <- grandparent
*/
public class Main {
    public static void main(String[] args) {
        // Inheritance =

        Animal animal = new Animal();
        animal.eat();
        System.out.println("Is the animal alive? : " + animal.isAlive);
        System.out.println(" ");

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Is the dog alive? : " + dog.isAlive);
        dog.eat();
        dog.speak();
        System.out.println("The dog has " + dog.life + " life");
        System.out.println(" ");

        System.out.println("Is the cat alive? : " + cat.isAlive);
        cat.eat();
        cat.speak();
        System.out.println("The cat has " + cat.life + " lives");

        System.out.println(" ");
        Plant plant = new Plant();
        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
