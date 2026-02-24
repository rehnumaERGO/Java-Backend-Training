package Overloaded_Constructors;

public class User {
    String email;
    String username;
    int age;

    // Constructor 1
    User() {
        this.username = "Guest";
        this.age = 0;
        this.email = "Not provided";
    }

    // Constructor 2
    User(String username) {
        this.username = username;
        this.age = 0;
        this.email = "Not provided";
    }

    // Constructor 3
    User(String username, String email) {
        this.username = username;
        this.age = 0;
        this.email = email;
    }

    // Constructor 4
    User(String username, String email, int age) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
}
