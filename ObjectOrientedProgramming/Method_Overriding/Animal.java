package Method_Overriding;

public class Animal {
    static int num;

    Animal() {
    }

    void move() {
        num++;
        System.out.println("This animal is running");
        System.out.println("The num = " + num);
    }
}
