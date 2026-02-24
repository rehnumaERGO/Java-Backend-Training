package Anonymous_Classes;

/*
Anonymous class = A class that doesn't have a name. Cannot be reused.
Add custom behavior without having to create a new class.
Often used for one time uses (TimerTask, Runnable, callbacks).
*/
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();

        // TakingDog takingDog = new TakingDog();
        // takingDog.speak();

        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };
        dog2.speak();
    }
}
