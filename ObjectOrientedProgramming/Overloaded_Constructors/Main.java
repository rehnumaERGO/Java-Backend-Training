package Overloaded_Constructors;

public class Main {
    public static void main(String[] args) {
        // OVERLOADED CONSTRUCTORS = Allows a class to have multiple constructors with
        // different parameter lists.
        // It enable objects to be initialized in various ways.

        User user = new User();
        User user1 = new User("Goldy");
        User user2 = new User("Patrik", "patrik@mail.com");
        User user3 = new User("Sandy", "sandy@mail.com", 34);

        System.out.println("username = " + user.username);
        System.out.println("email = " + user.email);
        System.out.println("age = " + user.age);
        System.out.println(" ");

        System.out.println("username = " + user1.username);
        System.out.println("email = " + user1.email);
        System.out.println("age = " + user1.age);
        System.out.println(" ");

        System.out.println("username = " + user2.username);
        System.out.println("email = " + user2.email);
        System.out.println("age = " + user2.age);
        System.out.println(" ");

        System.out.println("username = " + user3.username);
        System.out.println("email = " + user3.email);
        System.out.println("age = " + user3.age);
    }
}
