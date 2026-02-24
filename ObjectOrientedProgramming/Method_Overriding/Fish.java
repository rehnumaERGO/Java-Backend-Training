package Method_Overriding;

public class Fish extends Animal {

    Fish() {
        System.out.println("this is a fish");
    }

    @Override
    void move() {
        num++;
        System.out.println("This animal is swimming");
        System.out.println("The num = " + num);
    }
}
